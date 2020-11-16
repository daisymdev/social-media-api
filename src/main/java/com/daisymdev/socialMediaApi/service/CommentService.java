package com.daisymdev.socialMediaApi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daisymdev.socialMediaApi.entity.Comment;
import com.daisymdev.socialMediaApi.entity.Post;
import com.daisymdev.socialMediaApi.entity.User;
import com.daisymdev.socialMediaApi.repository.CommentRepository;
import com.daisymdev.socialMediaApi.repository.PostRepository;
import com.daisymdev.socialMediaApi.repository.UserRepository;

@Service
public class CommentService {

    @Autowired
    private CommentRepository repo;

    @Autowired
    private PostRepository postRepo;

    @Autowired
    private UserRepository userRepo;

    public Comment createComment(Comment comment, Long userId, Long postId) throws Exception {
        User user = userRepo.findOne(userId);
        Post post = postRepo.findOne(postId);
        if(user == null || post == null) {
            throw new Exception("User or Post does not exist.");
        }

        comment.setDate(new Date());
        comment.setUser(user);
        comment.setPost(post);
        return repo.save(comment);
    }

    public void deleteComment(Long commentId) {
        repo.delete(commentId);
    }
}
