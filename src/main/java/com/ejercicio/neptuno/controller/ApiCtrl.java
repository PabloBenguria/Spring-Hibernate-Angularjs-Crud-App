package com.ejercicio.neptuno.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio.neptuno.entities.Cliente;
import com.ejercicio.neptuno.entities.Empleado;
import com.ejercicio.neptuno.entities.Pedido;
import com.ejercicio.neptuno.services.impl.ClienteSrvImpl;
import com.ejercicio.neptuno.services.impl.EmpleadoSrvImpl;
import com.ejercicio.neptuno.services.impl.PedidoSrvImpl;


@RestController
@RequestMapping("api")
public class ApiCtrl {

	public static final Log LOG = LogFactory.getLog(ApiCtrl.class);
	
	@Autowired
	@Qualifier("clienteSrvImpl")
	private ClienteSrvImpl clienteSrvImpl;
	
	@Autowired
	@Qualifier("empleadoSrvImpl")
	private EmpleadoSrvImpl empleadoSrvImpl;
	
	@Autowired
	@Qualifier("pedidoSrvImpl")
	private PedidoSrvImpl pedidoSrvImpl;
	
	
	/************************ CLIENTES ************************/
	
	@GetMapping("/clientes")
	public List<Cliente> getClientes(){
		LOG.info("------>Llamada a getClientes()");
		return clienteSrvImpl.listAllClientes();
	}
	
	@GetMapping(value="clientes/{id}",  produces = MediaType.APPLICATION_JSON_VALUE)
	public Cliente getOneCliente(@PathVariable String id) {
		LOG.info("------>Llamada a getOneCliente() - Parámetro: id:" + id);
		return clienteSrvImpl.oneCliente(id);
	}
	
	@PostMapping("/clientes")
	public void crearCliente(@RequestBody Cliente cliente) {
		LOG.info("------>Llamada a crearCliente() - Parámetro: cliente:" + cliente);
		clienteSrvImpl.addCliente(cliente);
	}
	
	@PutMapping("/clientes")
	public void editarCliente(@RequestBody Cliente cliente) {
		LOG.info("------>Llamada a editarCliente() - Parámetro: cliente: " + cliente);
		clienteSrvImpl.addCliente(cliente);
	}
	
	
	/************************ EMPLEADOS ************************/
	
	@GetMapping("/empleados")
	public List<Empleado> getEmpleados(){
		LOG.info("------>Llamada a getEmpleados()");
		return empleadoSrvImpl.listAllEmpleados();
	}
	
	@GetMapping(value="empleados/{id}",  produces = MediaType.APPLICATION_JSON_VALUE)
	public Empleado getOneEmpleado(@PathVariable String id) {
		LOG.info("------>Llamada a getOneEmpleado() - Parámetro: id:" + id);
		return empleadoSrvImpl.oneEmpleado(id);
	}
	
	@PostMapping("/empleados")
	public void crearEmpleado(@RequestBody Empleado empleado) {
		LOG.info("------>Llamada a crearEmpleado() - Parámetro: empleado:" + empleado);
		empleadoSrvImpl.addEmpleado(empleado);
	}
	
	@PutMapping("/empleados")
	public void editarEmpleado(@RequestBody Empleado empleado) {
		LOG.info("------>Llamada a editarEmpleado() - Parámetro: empleado: " + empleado);
		empleadoSrvImpl.addEmpleado(empleado);
	}
	
	
	/************************ PEDIDOS ************************/
	
	@GetMapping("/pedidos")
	public List<Pedido> getPedidos(){
		LOG.info("------>Llamada a getPedidos()");
		return pedidoSrvImpl.listAllPedidos();
	}
	
	@GetMapping(value="pedidos/{id}",  produces = MediaType.APPLICATION_JSON_VALUE)
	public Pedido getOnePedido(@PathVariable String id) {
		LOG.info("------>Llamada a getOnePedido() - Parámetro: id:" + id);
		return pedidoSrvImpl.onePedido(id);
	}
	
	@PostMapping("/pedidos")
	public void crearPedido(@RequestBody Pedido pedido) {
		LOG.info("------>Llamada a crearPedido() - Parámetro: pedido:" + pedido);
		pedidoSrvImpl.addPedido(pedido);
	}
	
	@PutMapping("/pedidos")
	public void editarPedido(@RequestBody Pedido pedido) {
		LOG.info("------>Llamada a editarPedido() - Parámetro: pedido: " + pedido);
		pedidoSrvImpl.addPedido(pedido);
	}
	
}
