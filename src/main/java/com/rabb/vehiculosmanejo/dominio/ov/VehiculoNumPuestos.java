package com.rabb.vehiculosmanejo.dominio.ov;

import com.rabb.vehiculosmanejo.dominio.excepciones.InvalidoNumPuestosExcepcion;

public record VehiculoNumPuestos(int valor) {

    private static final int MINIMO = 1;
    private static final int MAXIMO = 100;

    public VehiculoNumPuestos {

        if (valor < MINIMO || valor > MAXIMO) {
            throw InvalidoNumPuestosExcepcion.becauseValueIsInvalid(
                    MINIMO,
                    MAXIMO
            );
        }
    }
}