package com.ejercicio.neptuno.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ejercicio.neptuno.entities.Cliente;
import com.ejercicio.neptuno.repositories.ClienteJpaRepository;
import com.ejercicio.neptuno.services.ClienteSrv;

@Service("clienteSrvImpl")
public class ClienteSrvImpl implements ClienteSrv {

	@Autowired
	@Qualifier("clienteJpaRepository")
	private ClienteJpaRepository clienteJpaRepository;
	
	@Override
	public List<Cliente> listAllClientes() {
		return clienteJpaRepository.findAll();
	}

	@Override
	public Cliente oneCliente(String id) {
		return clienteJpaRepository.findOne(Integer.parseInt(id));
	}

	@Override
	public void addCliente(Cliente cliente) {
		clienteJpaRepository.save(cliente);
	}

}
