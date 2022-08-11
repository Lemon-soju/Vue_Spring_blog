package com.example.lemonsoju_blog.controller;

import com.example.lemonsoju_blog.request.PostCreate;
import com.example.lemonsoju_blog.response.PostResponse;
import com.example.lemonsoju_blog.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping("/posts")
    public void post(@RequestBody @Valid PostCreate request) {
        postService.write(request);
    }

    @GetMapping("/posts/{postId}")
    public PostResponse get(@PathVariable Long postId) {
        PostResponse response = postService.get(postId);
        return response;
    }

}

