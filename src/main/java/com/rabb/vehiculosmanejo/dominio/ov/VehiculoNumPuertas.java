package com.rabb.vehiculosmanejo.dominio.ov;

import com.rabb.vehiculosmanejo.dominio.excepciones.InvalidoNumPuertasExcepcion;

public record VehiculoNumPuertas(int valor) {

    private static final int MINIMO = 0;
    private static final int MAXIMO = 10;

    public VehiculoNumPuertas {

        if (valor < MINIMO || valor > MAXIMO) {
            throw InvalidoNumPuertasExcepcion.becauseValueIsInvalid(
                    MINIMO,
                    MAXIMO
            );
        }
    }
}