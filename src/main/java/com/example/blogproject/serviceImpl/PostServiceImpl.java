package com.example.blogproject.serviceImpl;

import com.example.blogproject.models.Blogger;
import com.example.blogproject.models.Post;
import com.example.blogproject.repository.PostRepository;
import com.example.blogproject.repository.UserRepository;
import com.example.blogproject.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostRepository postRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public Post createPost(String title,String body,Long userId) {
        Blogger blogger = userRepository.getById(userId);
        LocalDateTime localDateTime= LocalDateTime.now();
          Post post = new Post();
          post.setBlogger(blogger);
          post.setTitle(title);
          post.setBody(body);
          post.setDate(localDateTime);
         return postRepository.save(post);

    }

//    @Override
//    public List<Post> viewPostByUser(Long userId) {
//        return postRepository.findAllByBlogger_Id(userId);
//    }
}
