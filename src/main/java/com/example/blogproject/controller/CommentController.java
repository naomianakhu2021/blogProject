package com.example.blogproject.controller;

import com.example.blogproject.models.Comment;
import com.example.blogproject.models.Post;
import com.example.blogproject.services.CommentService;
import com.example.blogproject.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/api/comments")
public class CommentController {
    @Autowired
    private CommentService commentService;
    @PostMapping("/{postId}/{userId}/")
    public ResponseEntity<Comment> createComment(@PathVariable(name = "postId")Long postId, @RequestParam(name="body")String body, @PathVariable(name="userId")Long userId){
        Comment comment  = commentService.createComment(postId,body,userId);
        return new ResponseEntity<>(comment, HttpStatus.CREATED);
    }

}