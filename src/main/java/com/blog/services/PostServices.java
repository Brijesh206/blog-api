package com.blog.services;

import com.blog.payloads.PostDto;
import com.blog.payloads.PostResponse;

import java.util.List;

public interface PostServices {

    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

    // get all posts
    PostResponse getAllPosts(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);

    // update
    PostDto updatePost(PostDto postDto, Integer postId);

    // delete
    void deletePost(Integer postId);

    // get post by id
    PostDto getPostById(Integer postId);

    // get posts by user
    List<PostDto> getPostByUser(Integer userId);

    // get posts by category
    List<PostDto> getPostByCategory(Integer categoryId);

    //search posts
    List<PostDto> searchPosts(String keyword);
}
