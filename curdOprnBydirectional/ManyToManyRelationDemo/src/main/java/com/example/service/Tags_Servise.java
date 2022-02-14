package com.example.service;

import com.example.model.Tag;

import java.util.List;

public interface Tags_Servise
{
    public Tag saveTags(Tag tags);
    public List<Tag> setAllTags();
    public Tag updateTags(Tag tags);
    public String deleteTags(Tag tags);
}
