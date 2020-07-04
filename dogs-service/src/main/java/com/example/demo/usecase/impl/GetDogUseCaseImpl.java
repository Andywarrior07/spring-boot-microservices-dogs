package com.example.demo.usecase.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.persistence.entities.DogEntity;
import com.example.demo.shared.constants.RestConstants;
import com.example.demo.usecase.GetDogUseCase;

@Component
public class GetDogUseCaseImpl implements GetDogUseCase {

	@Autowired
    private RestTemplate restTemplate;
	
	@Override
	public DogEntity getDogInfo(String breed) {
		String breedsUrl = breed + "&subBreedUrl="+ RestConstants.SERVICE_DOGS + breed + RestConstants.RESOURCE_LIST + "&breedImagesUrl="+ RestConstants.SERVICE_DOGS + breed + RestConstants.RESOURCE_IMAGES;
		DogEntity dogInfo = restTemplate.getForObject(RestConstants.SERVICE_URL + breedsUrl , DogEntity.class);
		return dogInfo;
	}

}
