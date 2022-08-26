package com.example.lemonsoju_blog.repository;

import com.example.lemonsoju_blog.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long>, PostRepositoryCustom {
}
