package com.bhaweshkumar.algorithm.demo.list.business.service;

import com.bhaweshkumar.algorithm.demo.model.RequestModel;
import org.springframework.stereotype.Service;

@Service
public class LinkedListService {

    public void buildSinglyLinkedList(RequestModel<String> request) {
        if (request != null && !request.getItems().isEmpty()) {
            request.getItems().forEach((String item) -> {

            });

        } else {
//            return null;
        }
    }
}
