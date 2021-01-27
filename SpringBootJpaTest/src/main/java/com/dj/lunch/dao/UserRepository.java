package com.dj.lunch.dao;

import com.dj.lunch.model.UserDO;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<UserDO,Integer> {

}