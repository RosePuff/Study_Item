package com.chin.entity;

import java.util.*;

/**
 * @ClassName: Student
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/15
 * @Version: 1.0
 **/
public class Student {
    private String name;
    private Address address;
    private String[] books;
    private List<String> cloe;
    private Map<String, String> cad;
    private Set<String> games;
    private Properties info;
    private String wife;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String[] getBooks() {
        return books;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    public List<String> getCloe() {
        return cloe;
    }

    public void setCloe(List<String> cloe) {
        this.cloe = cloe;
    }

    public Map<String, String> getCad() {
        return cad;
    }

    public void setCad(Map<String, String> cad) {
        this.cad = cad;
    }

    public Set<String> getGames() {
        return games;
    }

    public void setGames(Set<String> games) {
        this.games = games;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address.toString() +
                ", books=" + Arrays.toString(books) +
                ", cloe=" + cloe +
                ", cad=" + cad +
                ", games=" + games +
                ", info=" + info +
                ", wife='" + wife + '\'' +
                '}';
    }
}
