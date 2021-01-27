package com.dj.lunch.dao;

import com.dj.lunch.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Fant.J.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}