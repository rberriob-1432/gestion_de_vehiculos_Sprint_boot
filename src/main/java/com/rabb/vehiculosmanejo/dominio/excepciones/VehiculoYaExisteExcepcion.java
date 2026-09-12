package com.rabb.vehiculosmanejo.dominio.excepciones;

public final class VehiculoYaExisteExcepcion extends DominioExcepcion {

    private static final String MENSAJE =
            "Ya existe un vehículo con el ID '%s'.";

    private VehiculoYaExisteExcepcion(final String message) {
        super(message);
    }

    public static VehiculoYaExisteExcepcion becauseIdAlreadyExists(
            final String id
    ) {
        return new VehiculoYaExisteExcepcion(
                String.format(MENSAJE, id)
        );
    }
}