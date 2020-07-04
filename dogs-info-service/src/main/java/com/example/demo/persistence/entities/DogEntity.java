package com.example.demo.persistence.entities;

import java.util.List;
import java.util.Map;

public class DogEntity {
	
	private String breed;
	private String[] subBreeds;
	private List<Map<String,String>> images;
	
	public DogEntity(String breed, String[] subBreeds, List<Map<String,String>> images) {
		this.breed = breed;
		this.subBreeds = subBreeds;
		this.images = images;
	}
	
	public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    public String[] getSubBreeds() {
        return subBreeds;
    }

    public void setSubBreeds(String[] subBreeds) {
        this.subBreeds = subBreeds;
    }
    
	public List<Map<String,String>> getImages() {
        return images;
    }

    public void setImages(List<Map<String,String>> images) {
        this.images = images;
    }
}
