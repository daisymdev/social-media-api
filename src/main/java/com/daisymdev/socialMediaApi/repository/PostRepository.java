package com.daisymdev.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;
import com.daisymdev.socialMediaApi.entity.Post;

public interface PostRepository extends CrudRepository<Post, Long>{
    public Post findOne(Long id);

}
