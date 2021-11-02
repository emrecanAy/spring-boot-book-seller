package com.emrecan.springbootbookseller.security;

import com.emrecan.springbootbookseller.model.User;
import com.emrecan.springbootbookseller.service.IUserService;
import com.emrecan.springbootbookseller.util.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Emrecan
 * @created 02/11/2021 - 17:49
 */

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private IUserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userService.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException(username));

        Set<GrantedAuthority> authorities = Set.of(SecurityUtils.convertToAuthority(user.getRole().name()));

        return UserPrincipal.builder()
                .user(user).id(user.getId())
                .username(user.getUsername())
                .password(user.getPassword())
                .authorities(authorities)
                .build();
    }
}
