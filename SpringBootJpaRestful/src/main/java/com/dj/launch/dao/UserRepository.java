package com.dj.launch.dao;

import com.dj.launch.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path="user")   //就是这一行神奇的代码，甚至这一行都可以不写
public interface UserRepository extends JpaRepository<User, Integer> {
}