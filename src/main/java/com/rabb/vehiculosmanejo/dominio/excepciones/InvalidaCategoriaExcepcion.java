package com.rabb.vehiculosmanejo.dominio.excepciones;

public final class InvalidaCategoriaExcepcion extends DominioExcepcion {

    private static final String MENSAJE_VACIO =
            "La categoría no puede estar vacía.";

    private static final String MENSAJE_FORMATO_INVALIDO =
            "La categoría tiene un formato inválido.";

    private InvalidaCategoriaExcepcion(final String message) {
        super(message);
    }

    public static InvalidaCategoriaExcepcion becauseValueIsEmpty() {
        return new InvalidaCategoriaExcepcion(MENSAJE_VACIO);
    }

    public static InvalidaCategoriaExcepcion becauseFormatIsInvalid() {
        return new InvalidaCategoriaExcepcion(MENSAJE_FORMATO_INVALIDO);
    }
}