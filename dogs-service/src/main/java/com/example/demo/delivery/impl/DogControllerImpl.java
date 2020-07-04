package com.example.demo.delivery.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.persistence.entities.DogEntity;
import com.example.demo.shared.constants.RestConstants;
import com.example.demo.usecase.GetDogUseCase;

@RestController
@RequestMapping(RestConstants.API)
public class DogControllerImpl {
	
	@Autowired
	private GetDogUseCase getDogUseCase;
	
	@RequestMapping(path = RestConstants.RESOURCE_BREED + "{breed}" + RestConstants.RESOURCE_IMAGES, method = RequestMethod.GET)
    public DogEntity getBreed(@PathVariable(value="breed") String breed) {
        return getDogUseCase.getDogInfo(breed);
    }
}
