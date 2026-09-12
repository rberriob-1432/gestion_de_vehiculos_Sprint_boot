package com.rabb.vehiculosmanejo.dominio.excepciones;
public final class InvalidoModeloExcepcion extends DominioExcepcion {

    private static final String MENSAJE_VALOR_INVALIDO =
            "El modelo debe estar entre %d y %d.";

    private InvalidoModeloExcepcion(final String message) {
        super(message);
    }

    public static InvalidoModeloExcepcion becauseValueIsInvalid(
            final int minimo,
            final int maximo
    ) {
        return new InvalidoModeloExcepcion(
                String.format(MENSAJE_VALOR_INVALIDO, minimo, maximo)
        );
    }
}