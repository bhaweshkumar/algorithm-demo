package com.bhaweshkumar.algorithm.demo.sort;

import com.bhaweshkumar.algorithm.demo.sort.model.SortModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(MockitoJUnitRunner.class)
public class SortControllerTest {
    private MockMvc mockMvc;
    private SortController sortController;
    private SortModel sortModel;

    @Before
    public void setUp() throws Exception {
        sortController = new SortController();
        mockMvc = MockMvcBuilders.standaloneSetup(sortController).build();
        sortModel = new SortModel();
    }

    @Test
    public void insertionSort_isPost() throws Exception {
        mockMvc.perform(post("/api/sort/insertion")
                .content(new ObjectMapper().writeValueAsString(sortModel))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}