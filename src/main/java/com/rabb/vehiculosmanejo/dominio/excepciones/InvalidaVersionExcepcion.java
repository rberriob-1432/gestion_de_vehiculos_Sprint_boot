package com.rabb.vehiculosmanejo.dominio.excepciones;

public final class InvalidaVersionExcepcion extends DominioExcepcion {

    private static final String MENSAJE_VACIO =
            "La versión no puede estar vacía.";

    private static final String MENSAJE_VALOR_INVALIDO =
            "La versión tiene un formato inválido.";

    private InvalidaVersionExcepcion(final String message) {
        super(message);
    }

    public static InvalidaVersionExcepcion becauseValueIsEmpty() {
        return new InvalidaVersionExcepcion(MENSAJE_VACIO);
    }

    public static InvalidaVersionExcepcion becauseValueIsInvalid() {
        return new InvalidaVersionExcepcion(MENSAJE_VALOR_INVALIDO);
    }
}