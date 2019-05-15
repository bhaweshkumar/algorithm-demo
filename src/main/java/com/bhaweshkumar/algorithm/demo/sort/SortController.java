package com.bhaweshkumar.algorithm.demo.sort;

import com.bhaweshkumar.algorithm.demo.sort.model.SortModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.bhaweshkumar.algorithm.demo.constant.UrlMapping.INSERTION;
import static com.bhaweshkumar.algorithm.demo.constant.UrlMapping.SORT_ROOT;

@RestController
@RequestMapping(SORT_ROOT)
public class SortController {

    @Autowired
    public SortController() {
    }

    @PostMapping(value = INSERTION, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertionSort(@RequestBody SortModel request) {
        System.out.println(request);
    }
}
