package com.ejercicio.neptuno.services;

import java.util.List;

import com.ejercicio.neptuno.entities.Empleado;

public interface EmpleadoSrv {

	// Devuelve todos los empleados
	public abstract List<Empleado> listAllEmpleados();
	
	// Devuelve un empleado
	public abstract Empleado oneEmpleado(String id);
	
	// Crea / Edita un empleado 
	public abstract void addEmpleado(Empleado empleado);
	
}
