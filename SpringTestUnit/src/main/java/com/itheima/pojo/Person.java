package com.itheima.pojo;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;
import java.util.Map;

//@Configuration

@Component
@ConfigurationProperties(prefix = "person")
public class Person {
//    @Value("${person.name}")
    private String name;
//    @Value("${person.age}")
    private int age;

    private boolean isManager;

    private Date birthday;

    private Map<String,Object> map;

    private List<String> list;

    private Address address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    /**
     * 此处省略get/set/toString() 方法
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isManager=" + isManager +
                ", birthday=" + birthday +
                ", map=" + map +
                ", list=" + list +
                ", address=" + address +
                '}';
    }
}