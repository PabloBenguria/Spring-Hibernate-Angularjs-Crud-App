package com.ejercicio.neptuno.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@GeneratedValue
	@Column(name = "idcliente")
	private int idcliente;

	@Column(name = "nombreempresa")
	@NotNull
	@Size(min=3, max=40)
	private String nombreempresa;

	@Column(name = "nombrecontacto")
	@NotNull
	@Size(min=4, max=30)
	private String nombrecontacto;

	@Column(name = "direccion")
	@NotNull
	@Size(min=4, max=60)
	private String direccion;

	@Column(name = "ciudad")
	@NotNull
	@Size(min=4, max=20)
	private String ciudad;

	@Column(name = "codigopostal")
	@NotNull
	@Size(min=4, max=12)
	private String codigopostal;

	@Column(name = "pais")
	@NotNull
	@Size(min=2, max=20)
	private String pais;

	@Column(name = "telefono")
	@NotNull
	@Size(min=9, max=15)
	private String telefono;

	public Cliente() {

	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNombreempresa() {
		return nombreempresa;
	}

	public void setNombreempresa(String nombreempresa) {
		this.nombreempresa = nombreempresa;
	}

	public String getNombrecontacto() {
		return nombrecontacto;
	}

	public void setNombrecontacto(String nombrecontacto) {
		this.nombrecontacto = nombrecontacto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Cliente {idcliente=" + idcliente + ", nombreempresa=" + nombreempresa + ", nombrecontacto="
				+ nombrecontacto + ", direccion=" + direccion + ", ciudad=" + ciudad + ", codigopostal=" + codigopostal
				+ ", pais=" + pais + ", telefono=" + telefono + "}";
	}

}
