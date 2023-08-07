package com.asha.movies.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import lombok.Data;

//@Data
@Entity
@Table(name="film")
public class MoviesDto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String duration;
	private String hero_Name;
	private String heroine_Name;
	
	public MoviesDto() {

	}

	public MoviesDto(Integer id, String name, String duration, String hero_Name, String heroine_Name) {
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.hero_Name = hero_Name;
		this.heroine_Name = heroine_Name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getHero_Name() {
		return hero_Name;
	}

	public void setHero_Name(String hero_Name) {
		this.hero_Name = hero_Name;
	}

	public String getHeroine_Name() {
		return heroine_Name;
	}

	public void setHeroine_Name(String heroine_Name) {
		this.heroine_Name = heroine_Name;
	}

	@Override
	public String toString() {
		return "MoviesDto [id=" + id + ", name=" + name + ", duration=" + duration + ", hero_Name=" + hero_Name + ", heroine_Name=" + heroine_Name + "]";
	}
	
	
	
	

}
