package com.rabb.vehiculosmanejo.dominio.excepciones;
public final class CombustibleNoPermitidoExcepcion extends DominioExcepcion {

    private static final String MENSAJE =
            "El tipo de combustible no está permitido.";

    private CombustibleNoPermitidoExcepcion(final String message) {
        super(message);
    }

    public static CombustibleNoPermitidoExcepcion becauseFuelIsNotAllowed() {
        return new CombustibleNoPermitidoExcepcion(MENSAJE);
    }
}