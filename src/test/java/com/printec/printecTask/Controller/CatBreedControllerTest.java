package com.printec.printecTask.Controller;

import com.printec.printecTask.Service.CatBreedService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(controllers = CatBreedController.class)
public class CatBreedControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CatBreedService catBreedService;

    @Test
    public void testGetCatBreeds() throws Exception {
        mockMvc.perform(get("/api/catbreeds")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON));
    }
}
