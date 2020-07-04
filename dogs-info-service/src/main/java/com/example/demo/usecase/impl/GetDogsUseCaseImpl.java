package com.example.demo.usecase.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.demo.delivery.response.BreedInfo;
import com.example.demo.delivery.response.DogResponse;
import com.example.demo.usecase.GetDogUseCase;

@Component
public class GetDogsUseCaseImpl implements GetDogUseCase{
	
	@Autowired
    private RestTemplate restTemplate;
	
	@Override
	public DogResponse getDogSubBreeds(String subBreedUrl) {
		BreedInfo subBreeds = restTemplate.getForObject(subBreedUrl , BreedInfo.class);
		return new DogResponse(subBreeds);
	}
	
	@Override
	public DogResponse getDogImages(String imagesUrl) {
		BreedInfo subBreeds = restTemplate.getForObject(imagesUrl , BreedInfo.class);
		return new DogResponse(subBreeds);
	}
}
