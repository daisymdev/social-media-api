package com.daisymdev.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;
import com.daisymdev.socialMediaApi.entity.Post;
import org.springframework.data.repository.NoRepositoryBean;

public interface PostRepository extends CrudRepository<Post, Long>{

}
