package com.rabb.vehiculosmanejo.dominio.excepciones;

public final class InvalidoColorExcepcion extends DominioExcepcion {

    private static final String MENSAJE_VACIO =
            "El color no puede estar vacío.";

    private static final String MENSAJE_FORMATO_INVALIDO =
            "El color tiene un formato inválido.";

    private InvalidoColorExcepcion(final String message) {
        super(message);
    }

    public static InvalidoColorExcepcion becauseValueIsEmpty() {
        return new InvalidoColorExcepcion(MENSAJE_VACIO);
    }

    public static InvalidoColorExcepcion becauseFormatIsInvalid() {
        return new InvalidoColorExcepcion(MENSAJE_FORMATO_INVALIDO);
    }
}