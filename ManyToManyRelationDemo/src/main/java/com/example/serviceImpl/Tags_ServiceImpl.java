package com.example.serviceImpl;

import com.example.model.Tag;
import com.example.repository.Tags_Repo;
import com.example.service.Tags_Servise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class Tags_ServiceImpl implements Tags_Servise
{
    @Autowired
    private Tags_Repo tags_repo;
    @Override
    public Tag saveTags(Tag tags) {
        return tags_repo.save(tags);
    }

    @Override

    public List<Tag> setAllTags() {
        return tags_repo.findAll();
    }

    @Override
    public Tag updateTags(Tag tags) {
        return  tags_repo.save(tags);
    }

    @Override
    public String deleteTags(Tag tags) {
        tags_repo.delete(tags);
        return "Deleted tag";
    }
}
