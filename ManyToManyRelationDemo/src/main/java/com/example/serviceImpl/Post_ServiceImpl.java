package com.example.serviceImpl;

import com.example.model.Post;
import com.example.repository.Post_Repo;
import com.example.service.Post_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
@Service
public class Post_ServiceImpl implements Post_Service
{
    @Autowired
    private Post_Repo post_repo;

    @Override
    public Post savePosts(Post posts) {
        return post_repo.save(posts);
    }

    @Override
    public List<Post> setAllPosts() {
        return post_repo.findAll();
    }

    @Override
    public Post updatePosts(Post posts)` {
        return post_repo.save(posts);
    }

    @Override
    public String deletePosts(Post posts)
    {
        post_repo.delete(posts);
        return "Deleted Post";
    }
}
