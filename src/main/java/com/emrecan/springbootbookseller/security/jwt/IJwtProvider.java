package com.emrecan.springbootbookseller.security.jwt;

import com.emrecan.springbootbookseller.security.UserPrincipal;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Emrecan
 * @created 02/11/2021 - 19:42
 */
public interface IJwtProvider {
    String generateToken(UserPrincipal auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean validateToken(HttpServletRequest request);
}
