package com.rabb.vehiculosmanejo.dominio.enums;
import com.rabb.vehiculosmanejo.dominio.excepciones.InvalidoVehiculoEstatusExcepcion;

public enum VehiculoEstatus {

    ACTIVO,
    INACTIVO,
    PENDIENTE,
    BLOQUEADO;

    public static VehiculoEstatus fromString(final String value) {

        for (final VehiculoEstatus estatus : values()) {
            if (estatus.name().equalsIgnoreCase(value)) {
                return estatus;
            }
        }

        throw InvalidoVehiculoEstatusExcepcion.becauseValueIsInvalid(value);
    }
}