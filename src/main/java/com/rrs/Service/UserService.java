package com.rrs.Service;

import com.rrs.Dto.UserDto;
import com.rrs.entity.User;

public interface UserService {
	//Create and save a new User.
	UserDto saveUser(User user);

	// Retrieve a User by their unique ID.
	UserDto getUserById(int id);

	// Update a User by their unique ID.
	UserDto updateUserById(long id, User Uuser);

	// Delete a User by their unique ID.
	void deleteUserById(int id);

}
