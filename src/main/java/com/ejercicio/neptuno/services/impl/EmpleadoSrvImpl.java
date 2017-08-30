package com.ejercicio.neptuno.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ejercicio.neptuno.entities.Empleado;
import com.ejercicio.neptuno.repositories.EmpleadoJpaRepository;
import com.ejercicio.neptuno.services.EmpleadoSrv;

@Service("empleadoSrvImpl")
public class EmpleadoSrvImpl implements EmpleadoSrv {

	@Autowired
	@Qualifier("empleadoJpaRepository")
	private EmpleadoJpaRepository empleadoJpaRepository;
	
	@Override
	public List<Empleado> listAllEmpleados() {
		return empleadoJpaRepository.findAll();
	}

	@Override
	public Empleado oneEmpleado(String id) {
		return empleadoJpaRepository.findOne(Integer.parseInt(id));
	}

	@Override
	public void addEmpleado(Empleado empleado) {
		empleadoJpaRepository.save(empleado);
	}

}
