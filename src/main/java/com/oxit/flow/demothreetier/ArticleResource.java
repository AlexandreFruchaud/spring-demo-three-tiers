package com.oxit.flow.demothreetier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class ArticleResource {

    @Autowired
    ArticleService service;

    @GetMapping("/article/{id}")
    public Article getArticle(@PathParam("id") Long articleId) {
        return service.findById(articleId)
                .orElseThrow(() -> new RuntimeException("Article not found"));
    }

}
