package com.kommunalko.service;

import com.kommunalko.entity.User;
import com.kommunalko.exception.BadRequestException;
import com.kommunalko.exception.InternalServerError;
import com.kommunalko.exception.NotFoundException;

public interface UserService {

    User save(User user) throws InternalServerError, BadRequestException;
    User update(User user) throws InternalServerError, BadRequestException, NotFoundException;
    void delete(Long id) throws InternalServerError;
    User findById(Long id) throws InternalServerError, NotFoundException;

    User login(String email, String password) throws InternalServerError, BadRequestException;

}
