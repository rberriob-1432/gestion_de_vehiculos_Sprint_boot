package com.rabb.vehiculosmanejo.dominio.excepciones;

public final class InvalidoCilindrajeExcepcion extends DominioExcepcion {

    private static final String MENSAJE_VALOR_INVALIDO =
            "El cilindraje debe estar entre %d y %d.";

    private InvalidoCilindrajeExcepcion(final String message) {
        super(message);
    }

    public static InvalidoCilindrajeExcepcion becauseValueIsInvalid(
            final int minimo,
            final int maximo
    ) {
        return new InvalidoCilindrajeExcepcion(
                String.format(MENSAJE_VALOR_INVALIDO, minimo, maximo)
        );
    }
}