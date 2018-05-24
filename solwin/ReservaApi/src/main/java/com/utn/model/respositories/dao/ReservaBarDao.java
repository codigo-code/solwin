package com.utn.model.respositories.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.utn.model.Bar;
import com.utn.model.Persona;
import com.utn.model.respositories.ReservaBar;

@Repository
public class ReservaBarDao {

	@Autowired
	private ReservaBar reservaBar;
	
	@Transactional
	public void insertoBar(Bar bar) {
		reservaBar.save(bar);
	}
	
	
	
}
