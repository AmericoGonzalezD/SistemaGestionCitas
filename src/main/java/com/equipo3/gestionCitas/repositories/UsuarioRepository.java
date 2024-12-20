package com.equipo3.gestionCitas.repositories;

import com.equipo3.gestionCitas.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
//se pueden declarar los metodos adicionales aqui si no lo incluye jpaRepository
    Optional<Usuario> findByCorreo(String correo);
}
