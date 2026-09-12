package com.rabb.vehiculosmanejo.dominio.eventos;

import com.rabb.vehiculosmanejo.dominio.entidad.VehiculoEntidad;

import java.util.Map;

import lombok.Getter;

@Getter
public final class EliminarVehiculoEvento extends DomainEvent {

    private static final String EVENT_NAME = "vehiculo.deleted";

    private final VehiculoEntidad vehiculo;

    public EliminarVehiculoEvento(final VehiculoEntidad vehiculo) {
        super(EVENT_NAME);
        this.vehiculo = vehiculo;
    }

    @Override
    public Map<String, String> payload() {
        return Map.of("id", vehiculo.getId().valor().toString());
    }
}