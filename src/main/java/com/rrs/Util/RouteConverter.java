package com.rrs.Util;

import org.springframework.beans.BeanUtils;

import com.rrs.Dto.RouteDto;
import com.rrs.entity.Route;

public class RouteConverter {
	// This method converts a Route entity object to a RouteDto data transfer object.
			public RouteDto convertEntityToRouteDto(Route rrs)
			{
				// Create a new RouteDto instance to hold the converted data.
				RouteDto rRs =new RouteDto();
				
				// Check if the input Route entity is not null before copying properties.
				if(rrs != null)
				{
					// Copy properties from the Route entity to the RouteDto using BeanUtils.
					BeanUtils.copyProperties(rrs, rRs);
				}
				
				// Return the converted RouteDto.
				return rRs;
			}
			
			// This method converts a RouteDto data transfer object to a Route entity object.
			public Route convertRouteDtoToEntity(RouteDto rRs)
			{
				// Create a new Route instance to hold the converted data.
				Route rrs =new Route();
				
				// Check if the input RouteDto is not null before copying properties.
				if(rRs != null)
				{
					// Copy properties from the TrainDto to the Train entity using BeanUtils.
					BeanUtils.copyProperties(rRs, rrs);
				}
				
				// Return the converted Route entity.
				return rrs;
		}
}


