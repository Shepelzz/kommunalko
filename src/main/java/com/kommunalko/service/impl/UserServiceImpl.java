package com.kommunalko.service.impl;

import com.kommunalko.dao.UserDAO;
import com.kommunalko.entity.User;
import com.kommunalko.exception.BadRequestException;
import com.kommunalko.exception.InternalServerError;
import com.kommunalko.exception.NotFoundException;
import com.kommunalko.service.UserService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Log4j
@Service
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public User save(User user) throws InternalServerError, BadRequestException {
//        validateUserMainData(user);
        validateEmail(user.getEmail());

        return userDAO.save(user);
    }

    @Override
    public User update(User user) throws InternalServerError, BadRequestException{
        return userDAO.update(user);
    }

    @Override
    public void delete(Long id) throws InternalServerError {
        userDAO.delete(id);
    }

    @Override
    public User findById(Long id) throws InternalServerError, NotFoundException {
        return userDAO.findById(id);
    }

    @Override
    @Transactional
    public User login(String email, String password) throws InternalServerError, BadRequestException {
        User user = userDAO.getUserByAuthorization(email, password);
        if(user == null) {
            log.warn("Login fail for email "+email);
            throw new BadRequestException("Username or password is incorrect");
        }
        return user;
    }

    private void validateUserMainData(User user) throws BadRequestException{
    }

    private void validateEmail(String email) throws BadRequestException, InternalServerError {
        log.info("Start checking email ["+email+"] for existing in db");
        if(userDAO.getUserByEmail(email) != null) {
            log.warn("There is already registered user with email ["+email+"]");
            throw new BadRequestException("There is already registered user with email ["+email+"]");
        }
    }
}

