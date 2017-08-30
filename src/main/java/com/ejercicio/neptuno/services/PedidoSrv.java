package com.ejercicio.neptuno.services;

import java.util.List;

import com.ejercicio.neptuno.entities.Pedido;

public interface PedidoSrv {

	// Devuelve todos los pedidos
	public abstract List<Pedido> listAllPedidos();
	
	// Devuelve un pedido
	public abstract Pedido onePedido(String id);
	
	// Crea / Edita un pedido 
	public abstract void addPedido(Pedido pedido);
	
}
