package com.daisymdev.socialMediaApi.view;

import com.daisymdev.socialMediaApi.entity.User;

import java.util.Set;

public class FollowingJava {

    private Set<User> following;

    public FollowingJava(User user) {
        following = user.getFollowing();
    }

    public Set<User> getFollowing() {
        return following;
    }

    public void setFollowing(Set<User> following) {
        this.following = following;
    }
}
