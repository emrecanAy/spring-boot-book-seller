package com.emrecan.springbootbookseller.service;

import com.emrecan.springbootbookseller.model.User;

import java.util.Optional;

/**
 * @author Emrecan
 * @created 31/10/2021 - 23:43
 */
public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}
