package com.bhaweshkumar.algorithm.demo.list;

import com.bhaweshkumar.algorithm.demo.list.business.service.LinkedListService;
import com.bhaweshkumar.algorithm.demo.model.RequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.bhaweshkumar.algorithm.demo.constant.UrlMapping.LINKED_LIST_ROOT;
import static com.bhaweshkumar.algorithm.demo.constant.UrlMapping.SINGLY;

@RestController
@RequestMapping(LINKED_LIST_ROOT)
public class LinkedListController {

    private LinkedListService linkedListService;

    @Autowired
    public LinkedListController(LinkedListService linkedListService) {
        this.linkedListService = linkedListService;
    }

    @PostMapping(value = SINGLY, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void builSinglyLinkedList(@RequestBody RequestModel<String> request) {
        this.linkedListService.buildSinglyLinkedList(request);
    }
}
