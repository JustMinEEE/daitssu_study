package com.study.daitssu_study.user.controller;

import com.study.daitssu_study.user.model.ArticleEntity;
import com.study.daitssu_study.user.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/posts")
public class ArticleController {
    private final ArticleRepository articleRepository;

    @Autowired
    public ArticleController(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @PostMapping("/{userId}")
    public ArticleEntity createArticle(@RequestBody ArticleEntity article, @PathVariable String userId) {

        return articleRepository.save(article);
    }
}
