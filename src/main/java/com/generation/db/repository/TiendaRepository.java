package com.generation.db.repository;

import com.generation.db.model.Tienda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TiendaRepository extends JpaRepository<Tienda, Long> {

    Tienda findByNombreTienda(String nombreTienda);

    @Override
    void delete(Tienda tienda);
}
