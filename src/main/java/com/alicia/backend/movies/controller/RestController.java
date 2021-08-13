package com.alicia.backend.movies.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/movies")
public class RestController {

	@GetMapping
	public String getMovies() {
		return "hola";
	}
}
