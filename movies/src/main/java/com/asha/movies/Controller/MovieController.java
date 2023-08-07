package com.asha.movies.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.asha.movies.dto.MoviesDto;
import com.asha.movies.service.MoviesService;


@RestController
public class MovieController {

	@Autowired
	private MoviesService service;

	@PostMapping("/save")
	public ResponseEntity<String> create(@RequestBody MoviesDto dto) {
		String status = service.insert(dto);
		return new ResponseEntity<>(status, HttpStatus.CREATED);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<MoviesDto> getMovies(@PathVariable Integer Id) {
		MoviesDto byId = service.getById(Id);
		return new ResponseEntity<>(byId, HttpStatus.OK);

	}

	@GetMapping("/readAll")
	public ResponseEntity<List<MoviesDto>> getAllMovies() {
		List<MoviesDto> allMovies = service.getAllMovies();

		return new ResponseEntity<>(allMovies, HttpStatus.OK);

	}

	@PutMapping("/update")
	public ResponseEntity<String> updateMovies(@RequestBody MoviesDto dto) {
		String status = service.insert(dto);

		return new ResponseEntity<>(status, HttpStatus.OK);

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteMovies(@PathVariable Integer Id) {
		String deleteById = service.deleteById(Id);
		return new ResponseEntity<>(deleteById, HttpStatus.OK);

	}

}
