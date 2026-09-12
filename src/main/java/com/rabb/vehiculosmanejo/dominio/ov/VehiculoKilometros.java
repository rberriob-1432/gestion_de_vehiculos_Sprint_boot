package com.rabb.vehiculosmanejo.dominio.ov;

import com.rabb.vehiculosmanejo.dominio.excepciones.InvalidoKilometrosExcepcion;

public record VehiculoKilometros(long valor) {

    private static final long MINIMO = 0;
    private static final long MAXIMO = 2_000_000;

    public VehiculoKilometros {

        if (valor < MINIMO || valor > MAXIMO) {
            throw InvalidoKilometrosExcepcion.becauseValueIsInvalid(
                    MINIMO,
                    MAXIMO
            );
        }
    }
}