package com.printec.printecTask.Controller;

import com.printec.printecTask.Dto.CatBreed;
import com.printec.printecTask.Service.CatBreedService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/catbreeds")
public class CatBreedController {

    private final CatBreedService catBreedService;

    public CatBreedController(CatBreedService catBreedService) {
        this.catBreedService = catBreedService;
    }

    @GetMapping
    public ResponseEntity<List<CatBreed>> getAllCatBreeds() {
        List<CatBreed> catBreeds = catBreedService.getAllCatBreeds();
        return new ResponseEntity<>(catBreeds, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CatBreed> createCatBreed(@Validated @RequestBody CatBreed catBreed) {
        CatBreed created = catBreedService.saveOrUpdateCatBreed(catBreed);
        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }


    @PostMapping("/updateFromExternal")
    public ResponseEntity<List<CatBreed>> updateCatBreedsFromExternalSource() {
        List<CatBreed> updatedList = catBreedService.callExternalApi();
        return ResponseEntity.ok(updatedList);
    }
}
