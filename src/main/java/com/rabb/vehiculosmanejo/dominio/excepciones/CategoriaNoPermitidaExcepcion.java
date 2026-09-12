package com.rabb.vehiculosmanejo.dominio.excepciones;
public final class CategoriaNoPermitidaExcepcion extends DominioExcepcion {

    private static final String MENSAJE =
            "La categoría del vehículo no está permitida.";

    private CategoriaNoPermitidaExcepcion(final String message) {
        super(message);
    }

    public static CategoriaNoPermitidaExcepcion becauseCategoryIsNotAllowed() {
        return new CategoriaNoPermitidaExcepcion(MENSAJE);
    }
}