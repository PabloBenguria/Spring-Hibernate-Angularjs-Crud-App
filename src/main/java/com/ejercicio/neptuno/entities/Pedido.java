package com.ejercicio.neptuno.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

@Entity
@Table(name = "pedidos")
public class Pedido {

	@Id
	@GeneratedValue
	@Column(name = "idpedido")
	private int idpedido;

	@Column(name = "fechapedido") 
	private String fechapedido;

	@Column(name = "importe")
	@NotNull
	@NumberFormat(style=Style.NUMBER)
	@Min(1)
	private float importe;

	@Column(name = "destinatario")
	@NotNull
	@Size(min=4, max=40)
	private String destinatario;

	@Column(name = "direccion")
	@NotNull
	@Size(min=5, max=60)
	private String direccion;

	@Column(name = "codigopostal")
	@NotNull
	@Size(min=4, max=12)
	private String codigopostal;

	@Column(name = "pais")
	@NotNull
	@Size(min=2, max=20)
	private String pais;

	@ManyToOne
	@JoinColumn(name = "idcliente")
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "idempleado")
	private Empleado empleado;

	public Pedido() {

	}

	public int getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(int idpedido) {
		this.idpedido = idpedido;
	}

	public String getFechapedido() {
		return fechapedido;
	}

	public void setFechapedido(String fechapedido) {
		this.fechapedido = fechapedido;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCodigopostal() {
		return codigopostal;
	}

	public void setCodigopostal(String codigopostal) {
		this.codigopostal = codigopostal;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	@Override
	public String toString() {
		return "Pedido {idpedido=" + idpedido + ", fechapedido=" + fechapedido + ", importe=" + importe
				+ ", destinatario=" + destinatario + ", direccion=" + direccion + ", codigopostal=" + codigopostal
				+ ", pais=" + pais + ", cliente=" + cliente + ", empleado=" + empleado + "}";
	}

}
