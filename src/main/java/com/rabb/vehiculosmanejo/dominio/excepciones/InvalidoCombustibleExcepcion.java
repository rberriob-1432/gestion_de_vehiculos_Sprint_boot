package com.rabb.vehiculosmanejo.dominio.excepciones;

public final class InvalidoCombustibleExcepcion extends DominioExcepcion {

    private static final String MENSAJE_VACIO =
            "El combustible no puede estar vacío.";

    private static final String MENSAJE_FORMATO_INVALIDO =
            "El combustible tiene un formato inválido.";

    private InvalidoCombustibleExcepcion(final String message) {
        super(message);
    }

    public static InvalidoCombustibleExcepcion becauseValueIsEmpty() {
        return new InvalidoCombustibleExcepcion(MENSAJE_VACIO);
    }

    public static InvalidoCombustibleExcepcion becauseFormatIsInvalid() {
        return new InvalidoCombustibleExcepcion(MENSAJE_FORMATO_INVALIDO);
    }
}