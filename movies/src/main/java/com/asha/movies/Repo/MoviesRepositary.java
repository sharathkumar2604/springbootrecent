package com.asha.movies.Repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asha.movies.dto.MoviesDto;

@Repository
public interface MoviesRepositary extends JpaRepository<MoviesDto, Serializable>{

}
