package com.daisymdev.socialMediaApi.view;

public class FollowingJava {

    private Set<User> following;

    public Following(User user) {
        following = user.getFollowing();
    }

    public Set<User> getFollowing() {
        return following;
    }

    public void setFollowing(Set<User> following) {
        this.following = following;
    }
}
