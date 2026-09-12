package com.rabb.vehiculosmanejo.dominio.ov;

import com.rabb.vehiculosmanejo.dominio.excepciones.InvalidaPlacaExcepcion;

import java.util.regex.Pattern;

public record VehiculoPlaca(String valor) {

    private static final Pattern PATRON =
            Pattern.compile("^[A-Z]{3}\\d{3}$|^[A-Z]{3}\\d{2}[A-Z]$");

    public VehiculoPlaca {

        if (valor == null || valor.isBlank()) {
            throw InvalidaPlacaExcepcion.becauseValueIsEmpty();
        }

        valor = valor.trim().toUpperCase();

        if (!PATRON.matcher(valor).matches()) {
            throw InvalidaPlacaExcepcion.becauseFormatIsInvalid();
        }
    }
}