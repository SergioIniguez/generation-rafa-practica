package com.generation.db.repository;

import com.generation.db.model.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DireccionRepository extends JpaRepository<Direccion, Long> {

    Direccion findByCalle(String calle);

    Direccion findByFormatted(String format);

    @Override
    void delete(Direccion direccion);
}
