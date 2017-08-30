package com.ejercicio.neptuno.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejercicio.neptuno.entities.Pedido;

@Repository("pedidoJpaRepository")
public interface PedidoJpaRepository extends JpaRepository<Pedido, Serializable> {

}
