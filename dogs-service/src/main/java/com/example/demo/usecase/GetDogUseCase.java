package com.example.demo.usecase;

import com.example.demo.persistence.entities.DogEntity;

public interface GetDogUseCase {
	
	public DogEntity getDogInfo(String breed);
}
