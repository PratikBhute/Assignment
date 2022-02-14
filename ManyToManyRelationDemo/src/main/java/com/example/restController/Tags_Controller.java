package com.example.restController;

import com.example.model.Tag;
import com.example.serviceImpl.Tags_ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tags")
public class Tags_Controller
{
    @Autowired(required = true)
    private Tags_ServiceImpl tags_serviceImpl;

    @GetMapping("/")
    private List<Tag> findAllSet(){
        return tags_serviceImpl.setAllTags();
    }
    @PostMapping("/")
    private Tag savetags(Tag tags){
        return tags_serviceImpl.saveTags(tags);
    }
    @PutMapping("/")
    private Tag updateTags(Tag tags){
        return tags_serviceImpl.updateTags(tags);
    }
    @DeleteMapping("/")
    private String deleteTags(Tag tags){
        return tags_serviceImpl.deleteTags(tags);
    }

}
