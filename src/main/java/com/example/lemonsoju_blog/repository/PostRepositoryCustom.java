package com.example.lemonsoju_blog.repository;

import com.example.lemonsoju_blog.domain.Post;
import com.example.lemonsoju_blog.request.PostSearch;

import java.util.List;

public interface PostRepositoryCustom {

    List<Post> getList(PostSearch postSearch);
}
