package com.example.restController;

import com.example.model.Post;
import com.example.serviceImpl.Post_ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/post")
public class Post_RestController
{
    @Autowired(required = true)
    private Post_ServiceImpl post_serviceImpl;

    @GetMapping("/")
    public List<Post> findAllPost(){
        return post_serviceImpl.setAllPosts();
    }

    @PostMapping("/")
    private Post savePosts(@RequestBody Post posts){
        return post_serviceImpl.savePosts(posts);
    }
    @PutMapping("/")
    private Post updatePosts(@RequestBody Post posts){
        return post_serviceImpl.savePosts(posts);
    }
    @DeleteMapping("/")
    private String deletePosts(@RequestBody Post posts){
        return post_serviceImpl.deletePosts(posts);
    }


}
