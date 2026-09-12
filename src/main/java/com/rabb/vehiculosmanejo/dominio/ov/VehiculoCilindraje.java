package com.rabb.vehiculosmanejo.dominio.ov;

import com.rabb.vehiculosmanejo.dominio.excepciones.InvalidoCilindrajeExcepcion;

public record VehiculoCilindraje(int valor) {

    private static final int MINIMO = 0;
    private static final int MAXIMO = 10_000;

    public VehiculoCilindraje {

        if (valor < MINIMO || valor > MAXIMO) {
            throw InvalidoCilindrajeExcepcion.becauseValueIsInvalid(
                    MINIMO,
                    MAXIMO
            );
        }
    }
}