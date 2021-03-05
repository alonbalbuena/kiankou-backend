package com.alicia.backend.movies.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping
	public String getMovies() {
		return "hola";
	}
}
