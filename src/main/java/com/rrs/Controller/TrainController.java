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


import com.rrs.Dto.TrainDto;
import com.rrs.Service.TrainService;
import com.rrs.Util.TrainConverter;

public class TrainController {
	@Autowired
    TrainService trainService;

	@Autowired
	TrainConverter trainConverter;
   
    @PostMapping("/createTrain")
    public ResponseEntity<TrainDto> createTrain(@RequestBody TrainDto trainDto) {
        TrainDto createdTrain = trainService.saveTrain(trainConverter.convertTrainDtoToEntity(trainDto));
        return new ResponseEntity<>(createdTrain, HttpStatus.CREATED);
    }

    @GetMapping("getTrainById/{id}")
    public ResponseEntity<TrainDto> getTrainById(@PathVariable int id) {
    	TrainDto train = trainService.getTrainById(id);
        return new ResponseEntity<>(train, HttpStatus.OK);
    }

    @PutMapping("updateTrainById/{id}")
    public ResponseEntity<TrainDto> updateTrainById(@PathVariable int id, @RequestBody TrainDto trainDto) {
    	TrainDto updatedTrain = trainService.updateTrainById(id, trainConverter.convertTrainDtoToEntity(trainDto));
        return new ResponseEntity<>(updatedTrain, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTrainById(@PathVariable int id) {
    	trainService.deleteTrainById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
