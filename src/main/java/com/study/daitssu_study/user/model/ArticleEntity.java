package com.study.daitssu_study.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class ArticleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long article_id;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
    private String title;
    private String content;
    private Long user_id; // 게시글 작성 user_id와 연결?

    public ArticleEntity() {
    }

    public ArticleEntity(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Long getArticleId() {
        return article_id;
    }

    public void setArticleId(Long id) {
        this.article_id = id;
    }

    public LocalDateTime getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(LocalDateTime created_at) {
        this.created_at = created_at;
    }

    public LocalDateTime getUpdatedAt() {
        return updated_at;
    }

    public void setUpdatedAt(LocalDateTime updated_at) {
        this.updated_at = updated_at;
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

    @Override
    public String toString() {
        return "ArticleEntity{" +
                "article_id=" + article_id +
                ", title='" + title + '\'' +
                ", content='" + content +'\'' +
                '}';
    }
}
