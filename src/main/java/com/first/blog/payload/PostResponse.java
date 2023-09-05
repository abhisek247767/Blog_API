package com.first.blog.payload;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PostResponse {
	private List<PostDto> content;
	private int pageNumber;
	private int pageSize; //one page consits of how many posts
	private long totalElements;
	private int totalPages;	
	private boolean lastPage;

}
