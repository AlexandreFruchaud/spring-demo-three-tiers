package com.oxit.flow.demothreetier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleResource {

    @Autowired
    ArticleService service;

    @GetMapping("/article/{id}")
    public Article getArticle(@PathVariable("id") Long articleId) {
        return service.findById(articleId)
                .orElseThrow(() -> new RuntimeException("Article not found"));
    }

}
