package com.rabb.vehiculosmanejo.dominio.excepciones;

public final class InvalidoVehiculoIdExcepcion extends DominioExcepcion {

    private static final String MENSAJE_VALOR_NULO =
            "El ID del vehículo no puede ser nulo.";

    private InvalidoVehiculoIdExcepcion(final String message) {
        super(message);
    }

    public static InvalidoVehiculoIdExcepcion becauseValueIsNull() {
        return new InvalidoVehiculoIdExcepcion(MENSAJE_VALOR_NULO);
    }
}