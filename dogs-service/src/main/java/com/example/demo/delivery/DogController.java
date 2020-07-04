package com.example.demo.delivery;

import com.example.demo.persistence.entities.DogEntity;

public interface DogController {
	
	public DogEntity getDogInfo(String breed);
}
