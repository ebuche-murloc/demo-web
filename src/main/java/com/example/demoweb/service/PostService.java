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
    private static ArrayList<Post> posts;

    public PostService(){
        posts = new ArrayList<>();
        posts.add(new Post(0l,"цыганские фокусы", new Date()));
        posts.add(new Post(1l,"клоунада", new Date()));
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post((long) posts.size(),text, new Date()));
    }
}


