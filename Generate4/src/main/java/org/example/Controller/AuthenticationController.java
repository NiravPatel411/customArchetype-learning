package org.example.Controller;

import org.example.DTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {


    public ResponseEntity authenticateUser(UserDTO userDTO){
        return new ResponseEntity<>(HttpStatus.OK);
    }

}