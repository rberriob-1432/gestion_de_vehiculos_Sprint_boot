package com.rabb.vehiculosmanejo.dominio.ov;

import com.rabb.vehiculosmanejo.dominio.excepciones.InvalidoVehiculoIdExcepcion;

import java.util.UUID;

public record VehiculoId(UUID valor) {

    public VehiculoId {

        if (valor == null) {
            throw InvalidoVehiculoIdExcepcion.becauseValueIsNull();
        }
    }

    public static VehiculoId generar() {
        return new VehiculoId(UUID.randomUUID());
    }
}