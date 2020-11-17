package com.daisymdev.socialMediaApi.controller;

import com.daisymdev.socialMediaApi.entity.Comment;
import com.daisymdev.socialMediaApi.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/{userId}/posts/{postId}/comments")
public class CommentController {

    @Autowired
    private CommentService service;

    @RequestMapping(method= RequestMethod.POST)
    public ResponseEntity<Object> createComment(@RequestBody Comment comment, @PathVariable Long userId, @PathVariable Long postId) {
        try {
            return new ResponseEntity<Object>(service.createComment(comment, userId, postId), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

//    @RequestMapping(value = "/{commentId}", method = RequestMethod.DELETE)
//    public ResponseEntity<Object> deleteComment(@PathVariable Long commentId) {
//        service.deleteComment(commentId);
//        return new ResponseEntity<Object>("Deleted comment with id: " + commentId, HttpStatus.OK);
//    }
}
