package com.bhaweshkumar.algorithm.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Collections;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
public class RequestModel<T extends Object> {
    private List<T> items;

    public RequestModel() {
        this.items = Collections.emptyList();
    }
}
