package com.rabb.vehiculosmanejo.dominio.excepciones;

public final class VehiculoNoEncontradoExcepcion extends DominioExcepcion {

    private static final String MENSAJE =
            "No se encontró un vehículo con el ID '%s'.";

    private VehiculoNoEncontradoExcepcion(final String message) {
        super(message);
    }

    public static VehiculoNoEncontradoExcepcion becauseIdWasNotFound(
            final String id
    ) {
        return new VehiculoNoEncontradoExcepcion(
                String.format(MENSAJE, id)
        );
    }
}