package com.daisymdev.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;
import com.daisymdev.socialMediaApi.entity.Comment;
import org.springframework.data.repository.NoRepositoryBean;

public interface CommentRepository extends CrudRepository<Comment, Long> {

}
