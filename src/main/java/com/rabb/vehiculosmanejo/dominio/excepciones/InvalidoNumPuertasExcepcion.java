package com.rabb.vehiculosmanejo.dominio.excepciones;

public final class InvalidoNumPuertasExcepcion extends DominioExcepcion {

    private static final String MENSAJE_VALOR_INVALIDO =
            "El número de puertas debe estar entre %d y %d.";

    private InvalidoNumPuertasExcepcion(final String message) {
        super(message);
    }

    public static InvalidoNumPuertasExcepcion becauseValueIsInvalid(
            final int minimo,
            final int maximo
    ) {
        return new InvalidoNumPuertasExcepcion(
                String.format(MENSAJE_VALOR_INVALIDO, minimo, maximo)
        );
    }
}