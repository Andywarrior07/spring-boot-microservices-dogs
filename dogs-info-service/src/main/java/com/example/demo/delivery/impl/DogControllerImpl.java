package com.example.demo.delivery.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.delivery.DogController;
import com.example.demo.delivery.response.BreedInfo;
import com.example.demo.persistence.entities.DogEntity;
import com.example.demo.shared.constants.RestConstants;
import com.example.demo.usecase.GetDogUseCase;

@RestController
@RequestMapping(RestConstants.API)
public class DogControllerImpl implements DogController{
	
	@Autowired
	private GetDogUseCase getDogsUseCase;
	
	@Override
	@RequestMapping(path = RestConstants.RESOURCE_BREED, method = RequestMethod.GET)
	public DogEntity getDogInfo(@RequestParam(value = "breed") String breed,@RequestParam(value = "subBreedUrl") String subBreedUrl, @RequestParam(value = "breedImagesUrl") String breedImagesUrl) {
		BreedInfo subBreeds = getDogsUseCase.getDogSubBreeds(subBreedUrl).getBreedInfo();
		BreedInfo imagesInfo = getDogsUseCase.getDogImages(breedImagesUrl).getBreedInfo();
		
		List<Map<String,String>> images = new ArrayList<Map<String, String>>();
		for (String subBreed: imagesInfo.getMessage()) {
			HashMap<String, String> imagesMap = new HashMap<String, String>();
			imagesMap.put(RestConstants.KEY_URL, subBreed);
			images.add(imagesMap);
		}
		
		return new DogEntity(breed, subBreeds.getMessage(), images);
	}
	
}
