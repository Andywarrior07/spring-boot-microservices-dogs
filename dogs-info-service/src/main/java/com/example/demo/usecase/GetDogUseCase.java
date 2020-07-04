package com.example.demo.usecase;

import com.example.demo.delivery.response.DogResponse;

public interface GetDogUseCase {
	
	public DogResponse getDogSubBreeds(String subBreedUrl);
	
	public DogResponse getDogImages(String imagesUrl);
}
