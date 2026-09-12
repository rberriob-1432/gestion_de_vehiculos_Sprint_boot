package com.rabb.vehiculosmanejo.dominio.excepciones;

public final class PlacaNoEncontradaExcepcion extends DominioExcepcion {

    private static final String MENSAJE =
            "No se encontró un vehículo con la placa indicada.";

    private PlacaNoEncontradaExcepcion(final String message) {
        super(message);
    }

    public static PlacaNoEncontradaExcepcion becausePlateWasNotFound() {
        return new PlacaNoEncontradaExcepcion(MENSAJE);
    }
}