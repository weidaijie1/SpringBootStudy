package com.dj.dao.testssm2;


import com.dj.model.modelssm2.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Fant.J.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}