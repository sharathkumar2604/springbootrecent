package com.asha.movies.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asha.movies.Repo.MoviesRepositary;
import com.asha.movies.dto.MoviesDto;

@Service
public class MoviesServiceImpl implements MoviesService {

	@Autowired
	private MoviesRepositary repositary;

	@Override
	public String insert(MoviesDto dto) {

		repositary.save(dto);

		return "saved sucessfully";
	}

	@Override
	public MoviesDto getById(Integer id) {

		Optional<MoviesDto> findById = repositary.findById(id);

		if (findById.isPresent()) {
			return findById.get();

		}
		return null;

	}

	@Override
	public List<MoviesDto> getAllMovies() {
		return repositary.findAll();
	}

	@Override
	public String deleteById(Integer id) {
		if (repositary.existsById(id)) {
			repositary.deleteById(id);
			return "record found and deleted";
		} else {

			return "deleted unsucessfull no record found";
		}

	}
}