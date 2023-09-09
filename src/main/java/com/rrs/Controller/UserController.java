package com.rrs.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.rrs.Dto.UserDto;
import com.rrs.Service.UserService;
import com.rrs.Util.UserConverter;

public class UserController {
	@Autowired
	UserService userService;

	@Autowired
	UserConverter userConverter;
   
    @PostMapping("/createUser")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
    	UserDto createdUser = userService.saveUser(userConverter.convertUserDtoToEntity(userDto));
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @GetMapping("getUserById/{id}")
    public ResponseEntity<UserDto> getUserById(@PathVariable int id) {
    	UserDto user = userService.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PutMapping("updateUserById/{id}")
    public ResponseEntity<UserDto> updateUserById(@PathVariable int id, @RequestBody UserDto userDto) {
    	UserDto updatedUser = userService.updateUserById(id, userConverter.convertUserDtoToEntity(userDto));
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserById(@PathVariable int id) {
    	userService.deleteUserById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}


