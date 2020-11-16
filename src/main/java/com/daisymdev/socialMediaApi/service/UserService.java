package com.daisymdev.socialMediaApi.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.daisymdev.socialMediaApi.entity.User;
import com.daisymdev.socialMediaApi.repository.UserRepository;
import com.daisymdev.socialMediaApi.view.FollowingJava;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public User createUser(User user) {
        return repo.save(user);
    }

    public User Login(User user) throws Exception {
        User foundUser = repo.findByUsername(user.getUsername());
        if (foundUser != null && foundUser.getPassword().equals(user.getPassword())) {
            return foundUser;
        } else {
            throw new Exception("Invalid username or password.");
        }
    }

    public FollowingJava follow(Long userId, Long followId) throws Exception {
        User user = repo.findOne(userId);
        User follow = repo.findOne(followId);
        if (user == null || follow == null) {
            throw new Exception("User does not exist.");
        }
        user.getFollowing().add(follow);
        repo.save(user);
        return new FollowingJava(user);
    }

    public FollowingJava getFollowedUsers(Long userId, String url) throws Exception {
        User user = repo.findOne(userId);
        if (user == null) {
            throw new Exception("User does not exist.");
        }
        return new FollowingJava(user);
    }

    public User updateProfilePicture(Long userId, String url) throws Exception {
        User user = repo.findOne(userId);
        if (user == null) {
            throw new Exception("User does not exist");
        }
        user.setProfilePictureUrl(url);
        return repo.save(user);
    }
}
