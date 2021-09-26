package com.example.blogproject.serviceImpl;

import com.example.blogproject.enums.Status;
import com.example.blogproject.services.UserService;
import com.example.blogproject.models.Blogger;
import com.example.blogproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserRepository userRepository;
    @Override
    public Blogger getUserByEmailAndPassWord(String email, String password) {
        return userRepository.findBloggerByEmailAndPassword(email, password);
    }

    @Override
    public Blogger userRegistration(Blogger blogger) {
        blogger.setFirstName(blogger.getFirstName());
        blogger.setLastName(blogger.getLastName());
        blogger.setEmail(blogger.getEmail());
        blogger.setPassword(blogger.getPassword());
        blogger.setStatus(Status.ACTIVATED);


        return userRepository.save(blogger);
    }


}
