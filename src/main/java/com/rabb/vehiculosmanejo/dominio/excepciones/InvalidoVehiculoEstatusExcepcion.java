package com.rabb.vehiculosmanejo.dominio.excepciones;
public final class InvalidoVehiculoEstatusExcepcion extends DominioExcepcion {

    private static final String MENSAJE_VALOR_INVALIDO =
            "El estatus del vehículo '%s' no es válido.";

    private InvalidoVehiculoEstatusExcepcion(final String message) {
        super(message);
    }

    public static InvalidoVehiculoEstatusExcepcion becauseValueIsInvalid(
            final String value
    ) {
        return new InvalidoVehiculoEstatusExcepcion(
                String.format(MENSAJE_VALOR_INVALIDO, value)
        );
    }
}