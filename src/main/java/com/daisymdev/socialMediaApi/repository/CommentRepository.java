package com.daisymdev.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;
import com.daisymdev.socialMediaApi.entity.Comment;

public interface CommentRepository extends CrudRepository<Comment, Long> {
}
