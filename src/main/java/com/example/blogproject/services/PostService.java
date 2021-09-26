package com.example.blogproject.services;

import com.example.blogproject.models.Post;

import java.util.List;

public interface PostService {
    Post createPost(String title,String body,Long userId);
//    List<Post> viewPostByUser(Long userId);

}

