package com.rabb.vehiculosmanejo.dominio.excepciones;

public final class PlacaYaRegistradaExcepcion extends DominioExcepcion {

    private static final String MENSAJE =
            "La placa ya se encuentra registrada.";

    private PlacaYaRegistradaExcepcion(final String message) {
        super(message);
    }

    public static PlacaYaRegistradaExcepcion becausePlateAlreadyExists() {
        return new PlacaYaRegistradaExcepcion(MENSAJE);
    }
}