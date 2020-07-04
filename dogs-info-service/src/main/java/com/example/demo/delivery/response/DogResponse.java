package com.example.demo.delivery.response;

public class DogResponse {

	private BreedInfo breedInfo;
	
	public DogResponse( BreedInfo breedInfo) {
		this.breedInfo = breedInfo;
	}
    
    public BreedInfo getBreedInfo() {
        return breedInfo;
    }

    public void setBreedInfo(BreedInfo breedInfo) {
        this.breedInfo = breedInfo;
    }
}
