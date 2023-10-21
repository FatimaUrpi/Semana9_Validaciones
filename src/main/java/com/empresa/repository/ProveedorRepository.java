package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.empresa.entity.Modalidad;
import com.empresa.entity.Proveedor;

public interface ProveedorRepository extends JpaRepository<Proveedor, Integer>{
	//validaicon semana 9 -- RGISTRA
	@Query("select x from Proveedor x where x.nombre = ?1")
	public List<Proveedor> listaPorNombreIgualRegistra(String nombre);

	
	@Query("select x from Proveedor x where x.dni = ?1")
	public List<Proveedor> listaPorDniIgualRegistra(String dni);

}
