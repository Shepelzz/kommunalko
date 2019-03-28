package com.kommunalko.dao;

import com.kommunalko.entity.User;
import com.kommunalko.exception.InternalServerError;

public interface UserDAO extends AbstractDAO<User> {

    User getUserByEmail(String email) throws InternalServerError;
    User getUserByAuthorization(String email, String password) throws InternalServerError;

}
