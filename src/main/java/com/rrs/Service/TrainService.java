package com.rrs.Service;

import com.rrs.Dto.TrainDto;
import com.rrs.entity.Train;

public interface TrainService {
	//Create and save a new Train.
		TrainDto saveTrain(Train train);

		// Retrieve a Train by their unique ID.
		TrainDto getTrainById(int id);

		// Update a Train by their unique ID.
		TrainDto updateTrainById(long id, Train train);

		// Delete a Train by their unique ID.
		void deleteTrainById(int id);

}
