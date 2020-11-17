package com.daisymdev.socialMediaApi.view;

import com.daisymdev.socialMediaApi.entity.User;

import java.util.Set;

public class FollowingJava {

    private User following;


    public FollowingJava(User user) {
        following = (User) user.getFollowing();
    }

    public User getFollowing() {
        return following;
    }

    public void setFollowing(Set<User> following) {
        this.following = (User) following;
    }
}
