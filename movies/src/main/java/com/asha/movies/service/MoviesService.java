package com.asha.movies.service;

import java.util.List;


import com.asha.movies.dto.MoviesDto;

public interface MoviesService {
	
	public String insert(MoviesDto dto);
	
	public MoviesDto getById(Integer id);
	
	public List<MoviesDto> getAllMovies();
	
	public String deleteById(Integer id);

}
