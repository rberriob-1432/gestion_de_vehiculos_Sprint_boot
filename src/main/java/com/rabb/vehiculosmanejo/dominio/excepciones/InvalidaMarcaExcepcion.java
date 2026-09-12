package com.rabb.vehiculosmanejo.dominio.excepciones;

public final class InvalidaMarcaExcepcion extends DominioExcepcion {

    private static final String MENSAJE_VACIO =
            "La marca no puede estar vacía.";

    private static final String MENSAJE_FORMATO_INVALIDO =
            "La marca tiene un formato inválido.";

    private InvalidaMarcaExcepcion(final String message) {
        super(message);
    }

    public static InvalidaMarcaExcepcion becauseValueIsEmpty() {
        return new InvalidaMarcaExcepcion(MENSAJE_VACIO);
    }

    public static InvalidaMarcaExcepcion becauseFormatIsInvalid() {
        return new InvalidaMarcaExcepcion(MENSAJE_FORMATO_INVALIDO);
    }
}