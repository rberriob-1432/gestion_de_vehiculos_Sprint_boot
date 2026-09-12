package com.rabb.vehiculosmanejo.dominio.excepciones;
public final class InvalidoKilometrosExcepcion extends DominioExcepcion {

    private static final String MENSAJE_VALOR_INVALIDO =
            "El kilometraje debe estar entre %d y %d kilómetros.";

    private InvalidoKilometrosExcepcion(final String message) {
        super(message);
    }

    public static InvalidoKilometrosExcepcion becauseValueIsInvalid(
            final long minimo,
            final long maximo
    ) {
        return new InvalidoKilometrosExcepcion(
                String.format(MENSAJE_VALOR_INVALIDO, minimo, maximo)
        );
    }
}