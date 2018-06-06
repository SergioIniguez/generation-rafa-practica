package com.generation.config;

import com.generation.db.model.Direccion;
import com.generation.db.model.Tienda;
import com.generation.db.repository.DireccionRepository;
import com.generation.db.repository.TiendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import javax.transaction.Transactional;

public class SetupDataLoader implements ApplicationListener<ContextRefreshedEvent> {

    private boolean alreadySetup = false;

    @Autowired
    private DireccionRepository direccionRepository;

    @Autowired
    private TiendaRepository tiendaRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        if (alreadySetup) {
            return;
        }
    }

    @Transactional
    Direccion crearDireccionSiNoExiste(final String calle, final String numEx, final String numInt, final String cp, final String colonia, final String estado, final String pais, final String formatted){
        Direccion direccion = direccionRepository.findByFormatted(formatted);
        if (direccion == null) {
            direccion = new Direccion(calle, numEx, numInt, cp, colonia, estado, pais, formatted);
            direccion = direccionRepository.save(direccion);
        }

        return direccion;
    }

    @Transactional
    Tienda crearTiendaSiNoExiste(final String nombreTienda, final String categoria, final String noEmpelados, final String horario, final String telefono, final Direccion direccion) {
        Tienda tienda = tiendaRepository.findByNombreTienda(nombreTienda);
        if (tienda == null) {
            tienda.setNombreTienda(nombreTienda);
            tienda.setCategoria(categoria);
            tienda.setNoEmpleados(noEmpelados);
            tienda.setHorario(horario);
            tienda.setTelefono(telefono);
        }
        tienda.setDireccion(direccion);
        tiendaRepository.save(tienda);

        return tienda;
    }
}
