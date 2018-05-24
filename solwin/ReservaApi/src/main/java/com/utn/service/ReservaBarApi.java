package com.utn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.utn.model.Bar;
import com.utn.model.Cliente;
import com.utn.model.respositories.ReservaBar;
import com.utn.model.respositories.dao.ReservaDao;

@RestController
public class ReservaBarApi {

	@Autowired
	private ReservaBar reservaBar;

	@Autowired
	private Gson gson;

	@Autowired
	private ReservaDao reserva;

	@GetMapping(value = "getBar")
	public String getAllBar() {

		return gson.toJson(reservaBar.findAll());
	}

	@CrossOrigin
	@GetMapping(value = "getBar/{id}")
	public ResponseEntity getBarById(@PathVariable("id") Integer id) {

		return ResponseEntity.ok(gson.toJson(reservaBar.findById(id)));
	}

	@CrossOrigin
	@PostMapping(value = "save")
	public ResponseEntity<Bar> saveBar(@RequestBody Bar bar) {

		reservaBar.save(bar);

		return new ResponseEntity<Bar>(HttpStatus.OK);
	}

	@GetMapping(value = "getReserva/{id}")
	public ResponseEntity getReserva(@PathVariable("id") Integer id) {

		System.out.println(reserva.getAllPersonasReserva(id).get());
		
		for (Cliente item: reserva.getAllPersonasReserva(id).get().getListCliente()) {
			System.out.println(item);
		}
		return ResponseEntity.ok(reserva.getAllPersonasReserva(id));
	}

}
