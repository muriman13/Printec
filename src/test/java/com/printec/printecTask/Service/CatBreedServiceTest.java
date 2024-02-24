package com.printec.printecTask.Service;

import com.printec.printecTask.Dto.CatBreed;
import com.printec.printecTask.Repository.CatBreedRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

import org.springframework.web.client.RestTemplate;

import java.util.List;

class CatBreedServiceTest {

    @Mock
    private RestTemplate restTemplate;

    @Mock
    private CatBreedRepo catBreedRepository;

    @Mock
    private CatBreedService catBreedService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        catBreedService = new CatBreedService(catBreedRepository, restTemplate);
    }

    @Test
    void fetchCatBreedsTest() {
        when(catBreedService.getAllCatBreeds())
                .thenReturn(List.of(new CatBreed[]{
                        createCatBreedHelper(1L, "Abyssinian", "Ethiopia", "Natural/Standard", "Short", "Ticked"),
                        createCatBreedHelper(2L, "American Bobtail", "United States", "Mutation", "Short/Long", "All"),
                }));
        List<CatBreed> breeds = catBreedService.getAllCatBreeds();
        assertNotNull(breeds);
        assertFalse(breeds.isEmpty());
    }

    private CatBreed createCatBreedHelper(Long id, String breed, String country, String origin, String coat, String pattern) {
        CatBreed catBreed = new CatBreed();
        catBreed.setId(id);
        catBreed.setBreed(breed);
        catBreed.setCountry(country);
        catBreed.setOrigin(origin);
        catBreed.setCoat(coat);
        catBreed.setPattern(pattern);
        return catBreed;
    }
}