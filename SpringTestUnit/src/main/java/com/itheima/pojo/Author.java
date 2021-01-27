package com.itheima.pojo;

import lombok.Data;
import org.springframework.context.annotation.Bean;

import javax.persistence.*;

@Table(name ="t_author")
@Entity
@Data
public class Author   {
    private Long id;
    private String realName;
    private String nickName;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    // SET和GET方法略
}