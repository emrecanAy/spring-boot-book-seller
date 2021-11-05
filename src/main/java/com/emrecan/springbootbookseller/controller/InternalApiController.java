package com.emrecan.springbootbookseller.controller;

import com.emrecan.springbootbookseller.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Emrecan
 * @created 06/11/2021 - 01:24
 */

@RestController
@RequestMapping("api/internal") //pre-path
public class InternalApiController {

    @Autowired
    private UserService userService;

    @PutMapping("make-admin/{username}") //api/internal/make-admin/{username}
    public ResponseEntity<?> makeAdmin(@PathVariable String username){
        userService.makeAdmin(username);

        return new ResponseEntity<>(HttpStatus.OK);
    }


}
