package com.equipo3.gestionCitas.repositories;

import com.equipo3.gestionCitas.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
//se pueden declarar los metodos adicionales aqui si no lo incluye jpaRepository
}
