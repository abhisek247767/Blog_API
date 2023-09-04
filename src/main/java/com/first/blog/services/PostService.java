package com.first.blog.services;

import java.util.List;

import com.first.blog.payload.PostDto;


public interface PostService {
	
	//create 

		PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);

		//update 

		PostDto updatePost(PostDto postDto, Integer postId);

		// delete

		void deletePost(Integer postId);
		

		
		//get single post
		
		PostDto getPostById(Integer postId);//
		
		//get all posts by category
		
		List<PostDto> getPostsByCategory(Integer categoryId);
		
		//get all posts by user
		List<PostDto> getPostsByUser(Integer userId);
		

}
