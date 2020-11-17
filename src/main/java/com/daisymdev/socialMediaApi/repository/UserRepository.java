package com.daisymdev.socialMediaApi.repository;

import org.springframework.data.repository.CrudRepository;
import com.daisymdev.socialMediaApi.entity.User;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    public User findByUsername(String username);

}
