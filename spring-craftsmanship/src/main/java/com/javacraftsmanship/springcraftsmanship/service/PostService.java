package com.javacraftsmanship.springcraftsmanship.service;


import com.javacraftsmanship.springcraftsmanship.dto.request.PostRequestDto;
import com.javacraftsmanship.springcraftsmanship.dto.response.PostResponseDto;
import com.javacraftsmanship.springcraftsmanship.dto.response.PostResponsePaginatedDto;

import java.util.List;


public interface PostService {
  PostResponseDto getById (Long id);
  PostResponsePaginatedDto getAll (int pageNo, int pageSize,String sortBy,String sortDir);
  PostResponseDto create (PostRequestDto postRequestDto);
  PostResponseDto update (PostRequestDto postRequestDto, Long id);
  void delete (Long id);
}
