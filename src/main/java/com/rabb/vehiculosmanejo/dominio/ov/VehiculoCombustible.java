package com.rabb.vehiculosmanejo.dominio.ov;

import com.rabb.vehiculosmanejo.dominio.excepciones.InvalidoCombustibleExcepcion;

import java.util.regex.Pattern;

public record VehiculoCombustible(String valor) {

    private static final Pattern PATRON =
            Pattern.compile("^[A-Za-zÁÉÍÓÚáéíóúÑñ -]++$");

    private static final int LONGITUD_MINIMA = 3;
    private static final int LONGITUD_MAXIMA = 20;

    public VehiculoCombustible {

        if (valor == null || valor.isBlank()) {
            throw InvalidoCombustibleExcepcion.becauseValueIsEmpty();
        }

        valor = valor.trim();

        if (valor.length() < LONGITUD_MINIMA
                || valor.length() > LONGITUD_MAXIMA
                || !PATRON.matcher(valor).matches()) {
            throw InvalidoCombustibleExcepcion.becauseFormatIsInvalid();
        }
    }
}