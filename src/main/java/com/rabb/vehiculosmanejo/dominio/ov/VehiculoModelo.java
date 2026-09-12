package com.rabb.vehiculosmanejo.dominio.ov;
import com.rabb.vehiculosmanejo.dominio.excepciones.InvalidoModeloExcepcion;
import java.time.Year;

public record VehiculoModelo(int valor) {

    private static final int MODELO_MINIMO = 1886;
    private static final int MODELO_MAXIMO = Year.now().getValue() + 1;

    public VehiculoModelo {

        if (valor < MODELO_MINIMO || valor > MODELO_MAXIMO) {
            throw InvalidoModeloExcepcion.becauseValueIsInvalid(
                    MODELO_MINIMO,
                    MODELO_MAXIMO
            );
        }
    }
}