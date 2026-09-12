package com.rabb.vehiculosmanejo.dominio.excepciones;
import com.rabb.vehiculosmanejo.dominio.excepciones.DominioExcepcion;
public final class InvalidaPlacaExcepcion extends DominioExcepcion {

    private static final String MENSAJE_VACIO =
            "La placa no puede estar vacía.";

    private static final String MENSAJE_FORMATO_INVALIDO =
            "La placa tiene un formato inválido.";

    private InvalidaPlacaExcepcion(final String message) {
        super(message);
    }

    public static InvalidaPlacaExcepcion becauseValueIsEmpty() {
        return new InvalidaPlacaExcepcion(MENSAJE_VACIO);
    }

    public static InvalidaPlacaExcepcion becauseFormatIsInvalid() {
        return new InvalidaPlacaExcepcion(MENSAJE_FORMATO_INVALIDO);
    }
}