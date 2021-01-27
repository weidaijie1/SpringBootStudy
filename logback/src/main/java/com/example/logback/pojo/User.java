package com.example.logback.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * TODO User实体类
 *
 * @author liuzebiao
 * @Date 2020-4-10 13:42
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

    private int id;

    private String name;

    private int age;

    private String email;

    private String address;

}
