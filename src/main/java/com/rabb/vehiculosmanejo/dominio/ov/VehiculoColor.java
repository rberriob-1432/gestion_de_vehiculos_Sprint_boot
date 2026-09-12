package com.rabb.vehiculosmanejo.dominio.ov;

import com.rabb.vehiculosmanejo.dominio.excepciones.InvalidoColorExcepcion;

import java.util.regex.Pattern;

public record VehiculoColor(String valor) {

    private static final Pattern PATRON =
            Pattern.compile("^[A-Za-zÁÉÍÓÚáéíóúÑñ ]++$");

    private static final int LONGITUD_MINIMA = 3;
    private static final int LONGITUD_MAXIMA = 20;

    public VehiculoColor {

        if (valor == null || valor.isBlank()) {
            throw InvalidoColorExcepcion.becauseValueIsEmpty();
        }

        valor = valor.trim();

        if (valor.length() < LONGITUD_MINIMA
                || valor.length() > LONGITUD_MAXIMA
                || !PATRON.matcher(valor).matches()) {
            throw InvalidoColorExcepcion.becauseFormatIsInvalid();
        }
    }
}