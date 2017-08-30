package com.ejercicio.neptuno.services;

import java.util.List;

import com.ejercicio.neptuno.entities.Cliente;


public interface ClienteSrv {

	// Devuelve todos los clientes
	public abstract List<Cliente> listAllClientes();
	
	// Devuelve un cliente
	public abstract Cliente oneCliente(String id);
	
	// Crea / Edita un cliente 
	public abstract void addCliente(Cliente cliente);
	
}
