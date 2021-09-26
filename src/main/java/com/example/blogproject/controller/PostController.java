package com.example.blogproject.controller;


import com.example.blogproject.DTO.LoginDTO;
import com.example.blogproject.models.Post;
import com.example.blogproject.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping( "/api/posts")
public class PostController {
    @Autowired
    private PostService postService;



    @PostMapping("/{userId}/")
    public ResponseEntity<Post> createPost(@RequestParam(name = "title")String title, @RequestParam(name="body")String body, @PathVariable(name="userId")Long Id){
        Post post = postService.createPost(title,body,Id);
        return new ResponseEntity<>(post, HttpStatus.CREATED);
    }



}