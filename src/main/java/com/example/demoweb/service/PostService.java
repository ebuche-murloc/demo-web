package com.example.demoweb.service;

import com.example.demoweb.DemoWebApplication;
import com.example.demoweb.model.Post;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts() {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("колдунство", new Date()));
        posts.add(new Post("цыганские фокусы", new Date()));
        posts.add(new Post("наконец-то робит как надо", new Date()));
        return posts;
    }
}


