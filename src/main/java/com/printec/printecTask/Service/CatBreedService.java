package com.printec.printecTask.Service;

import com.printec.printecTask.Dto.CatBreed;
import com.printec.printecTask.Repository.CatBreedRepo;
import com.printec.printecTask.Wrapper.CatBreedResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatBreedService {

    private final CatBreedRepo catBreedRepository;


    private RestTemplate restTemplate;

    private final String url = "https://catfact.ninja/breeds";

    @Autowired
    public CatBreedService(CatBreedRepo catBreedRepository, RestTemplate restTemplate) {
        this.catBreedRepository = catBreedRepository;
        this.restTemplate = restTemplate;
    }
    public List<CatBreed> getAllCatBreeds() {
        return catBreedRepository.findAll();
    }

    public CatBreed saveOrUpdateCatBreed(CatBreed catBreed) {
        return catBreedRepository.save(catBreed);
    }

    public List<CatBreed> saveOrUpdateListOfCatBreed(List<CatBreed> catBreeds) {
        return catBreedRepository.saveAll(catBreeds);
    }

    public List<CatBreed> callExternalApi() {
        CatBreedResponseWrapper response = restTemplate.getForObject(url, CatBreedResponseWrapper.class);
        if (response != null && response.getData() != null) {
            return catBreedRepository.saveAll(response.getData());
        } else {
            return new ArrayList<>();
        }
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
