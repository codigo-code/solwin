package com.utn.model.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.utn.model.Cliente;

@Component
@Repository
public interface ClientRepo extends JpaRepository<Cliente, Integer > {

}
