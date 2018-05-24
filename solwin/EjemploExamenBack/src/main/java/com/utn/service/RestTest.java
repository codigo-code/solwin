package com.utn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class RestTest {

	@Autowired
	private ToAlmicar amilcar;
	
	@CrossOrigin
	@GetMapping(value="test.do")
	public ResponseEntity test() {
		
		amilcar.setNombre("test");
		Gson g = new Gson();
		return ResponseEntity.ok(g.toJson(amilcar));
	}
	
}
