package com.example.service;

import com.example.model.Post;

import java.util.List;
public interface Post_Service
{
    public Post savePosts(Post posts);
    public List<Post> setAllPosts();
    public Post updatePosts(Post posts);
    public String deletePosts(Post posts);
}
