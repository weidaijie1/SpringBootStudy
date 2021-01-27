package com.itheima.dao;


import com.itheima.pojo.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AuthorDao  extends JpaRepository<Author,Long> {

}
