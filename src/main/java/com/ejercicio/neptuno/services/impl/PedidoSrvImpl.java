package com.ejercicio.neptuno.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ejercicio.neptuno.entities.Pedido;
import com.ejercicio.neptuno.repositories.PedidoJpaRepository;
import com.ejercicio.neptuno.services.PedidoSrv;

@Service("pedidoSrvImpl")
public class PedidoSrvImpl implements PedidoSrv {

	@Autowired
	@Qualifier("pedidoJpaRepository")
	private PedidoJpaRepository pedidoJpaRepository;
	
	@Override
	public List<Pedido> listAllPedidos() {
		return pedidoJpaRepository.findAll();
	}

	@Override
	public Pedido onePedido(String id) {
		return pedidoJpaRepository.findOne(Integer.parseInt(id));
	}

	@Override
	public void addPedido(Pedido pedido) {
		pedidoJpaRepository.save(pedido);
	}

}
