package com.ohgiraffers.semiproject.model;

import java.time.LocalDateTime;

public class Post {

    private String id; // 사용자 계정

    private String title; // 글 제목

    private String content; // 게시글 내용

    private String name; // 사용자 이름

    private LocalDateTime createdAt;

    public Post(String id, String title, String content, String name) {

        this.id = id;
        this.title = title;
        this.content = content;
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
