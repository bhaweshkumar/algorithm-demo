package com.bhaweshkumar.algorithm.demo.sort.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class SortModel {
    private List<Integer> items;
    private boolean ascending;

    public SortModel() {
        this.items = new ArrayList<>();
        this.ascending = true;
    }
}
