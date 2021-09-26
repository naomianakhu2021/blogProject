package com.example.blogproject.serviceImpl;

import com.example.blogproject.models.Blogger;
import com.example.blogproject.models.Comment;
import com.example.blogproject.models.Post;
import com.example.blogproject.repository.CommentRepository;
import com.example.blogproject.repository.PostRepository;
import com.example.blogproject.repository.UserRepository;
import com.example.blogproject.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    PostRepository postRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
   CommentRepository commentRepository;

    @Override
    public Comment createComment(Long postId, String commentBody, Long userId) {
        Comment comment = new Comment();
        LocalDateTime localDateTime = LocalDateTime.now();
        Post post = postRepository.getById(postId);
        Blogger blogger = userRepository.getById(userId);
        comment.setDate(localDateTime);
        comment.setCommentBody(commentBody);
        comment.setBlogger(blogger);
        comment.setPost(post);
        return commentRepository.save(comment);

    }

//    @Override
//    public List<Comment> viewCommentsOnPost(Long postId){
//        return commentRepository.findAllByPost_Id(postId);
//    }


}
