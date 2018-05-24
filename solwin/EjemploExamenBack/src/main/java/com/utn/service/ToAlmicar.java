package com.utn.service;

import org.springframework.stereotype.Component;

@Component
public class ToAlmicar {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
