package com.utn.model.respositories.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.utn.model.Reserva;
import com.utn.model.respositories.ReservaRepository;

@Component
public class ReservaDao {

	
	@Override
	public String toString() {
		return "ReservaDao [reserva=" + reserva + "]";
	}


	@Autowired
	private ReservaRepository reserva;
	
	
	public Optional<Reserva> getAllPersonasReserva(Integer id){
		
		return reserva.findById(id);
	}
}
