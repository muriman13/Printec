package com.printec.printecTask.IT;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CatBreedIT {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void catFactApiIsUp() {
        ResponseEntity<String> response = testRestTemplate.getForEntity("https://catfact.ninja/breeds", String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode(), "CatFact API is not up");
    }
}