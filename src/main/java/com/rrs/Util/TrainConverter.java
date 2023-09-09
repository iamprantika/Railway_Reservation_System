package com.rrs.Util;

import org.springframework.beans.BeanUtils;

import com.rrs.Dto.TrainDto;
import com.rrs.entity.Train;

public class TrainConverter {
	// This method converts a Train entity object to a TrainDto data transfer object.
		public TrainDto convertEntityToTrainDto(Train rrs)
		{
			// Create a new TrainDto instance to hold the converted data.
			TrainDto rRs =new TrainDto();
			
			// Check if the input Train entity is not null before copying properties.
			if(rrs != null)
			{
				// Copy properties from the Train entity to the TrainDto using BeanUtils.
				BeanUtils.copyProperties(rrs, rRs);
			}
			
			// Return the converted TrainDto.
			return rRs;
		}
		
		// This method converts a TrainDto data transfer object to a Train entity object.
		public Train convertTrainDtoToEntity(TrainDto rRs)
		{
			// Create a new Train instance to hold the converted data.
			Train rrs =new Train();
			
			// Check if the input TrainDto is not null before copying properties.
			if(rRs != null)
			{
				// Copy properties from the TrainDto to the Train entity using BeanUtils.
				BeanUtils.copyProperties(rRs, rrs);
			}
			
			// Return the converted Train entity.
			return rrs;
		}
}



