package com.rabb.vehiculosmanejo.dominio.excepciones;

public final class InvalidoNumPuestosExcepcion extends DominioExcepcion {

    private static final String MENSAJE_VALOR_INVALIDO =
            "El número de puestos debe estar entre %d y %d.";

    private InvalidoNumPuestosExcepcion(final String message) {
        super(message);
    }

    public static InvalidoNumPuestosExcepcion becauseValueIsInvalid(
            final int minimo,
            final int maximo
    ) {
        return new InvalidoNumPuestosExcepcion(
                String.format(MENSAJE_VALOR_INVALIDO, minimo, maximo)
        );
    }
}