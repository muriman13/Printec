package com.printec.printecTask.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.printec.printecTask.Dto.CatBreed;
import com.printec.printecTask.Service.CatBreedService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(controllers = CatBreedController.class)
public class CatBreedControllerSaveTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CatBreedService catBreedService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testSaveCatBreed() throws Exception {
        CatBreed catBreed = new CatBreed();
        catBreed.setBreed("TestBreed");
        catBreed.setCoat("furry");
        catBreed.setCountry("Romania");
        catBreed.setOrigin("Romania");
        mockMvc.perform(post("/api/catbreeds")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(catBreed)))
                .andExpect(status().is2xxSuccessful());
    }
}
