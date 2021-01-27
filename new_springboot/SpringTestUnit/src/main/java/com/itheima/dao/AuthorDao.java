package com.itheima.dao;


import com.itheima.pojo.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorDao extends JpaRepository<Author, Long> {

}
