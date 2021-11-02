package com.emrecan.springbootbookseller.service;

import com.emrecan.springbootbookseller.model.User;

/**
 * @author Emrecan
 * @created 02/11/2021 - 20:31
 */
public interface IAuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
