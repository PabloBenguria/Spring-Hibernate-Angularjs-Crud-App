package com.ejercicio.neptuno.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "empleados")
public class Empleado {

	@Id
	@GeneratedValue
	@Column(name = "idempleado")
	private int idempleado;

	@Column(name = "nombre")
	@NotNull
	@Size(min=4, max=10)
	private String nombre;

	@Column(name = "apellidos")
	@NotNull
	@Size(min=4, max=20)
	private String apellidos;

	@Column(name = "cargo")
	@NotNull
	@Size(min=4, max=10)
	private String cargo;

	@Column(name = "direccion")
	@NotNull
	@Size(min=4, max=60)
	private String direccion;

	@Column(name = "ciudad")
	@NotNull
	@Size(min=4, max=20)
	private String ciudad;

	@Column(name = "codpostal")
	@NotNull
	@Size(min=4, max=12)
	private String codpostal;

	@Column(name = "pais")
	@NotNull
	@Size(min=2, max=20)
	private String pais;

	@Column(name = "telefono")
	@NotNull
	@Size(min=4, max=15)
	private String telefono;

	public Empleado() {

	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
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

	public String getCodpostal() {
		return codpostal;
	}

	public void setCodpostal(String codpostal) {
		this.codpostal = codpostal;
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
		return "Empleado {idempleado=" + idempleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", cargo="
				+ cargo + ", direccion=" + direccion + ", ciudad=" + ciudad + ", codpostal=" + codpostal + ", pais="
				+ pais + ", telefono=" + telefono + "}";
	}

}
