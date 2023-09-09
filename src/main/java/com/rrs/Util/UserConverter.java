package com.rrs.Util;

import org.springframework.beans.BeanUtils;

import com.rrs.Dto.UserDto;
import com.rrs.entity.User;

public class UserConverter {
	// This method converts a User entity object to a UserDto data transfer object.
			public UserDto convertEntityToUserDto(User rrs)
			{
				// Create a new UserDto instance to hold the converted data.
				UserDto rRs =new UserDto();
				
				// Check if the input User entity is not null before copying properties.
				if(rrs != null)
				{
					// Copy properties from the User entity to the UserDto using BeanUtils.
					BeanUtils.copyProperties(rrs, rRs);
				}
				
				// Return the converted UserDto.
				return rRs;
			}
			
			// This method converts a UserDto data transfer object to a User entity object.
			public User convertUserDtoToEntity(UserDto rRs)
			{
				// Create a new User instance to hold the converted data.
				User rrs =new User();
				
				// Check if the input UserDto is not null before copying properties.
				if(rRs != null)
				{
					// Copy properties from the UserDto to the User entity using BeanUtils.
					BeanUtils.copyProperties(rRs, rrs);
				}
				
				// Return the converted User entity.
				return rrs;
		}
}
