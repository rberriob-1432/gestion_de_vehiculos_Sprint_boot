package com.rabb.vehiculosmanejo.dominio.ov;

import com.rabb.vehiculosmanejo.dominio.excepciones.InvalidaMarcaExcepcion;

import java.util.regex.Pattern;

public record VehiculoMarca(String valor) {

    private static final Pattern PATRON =
            Pattern.compile("^[A-Za-zÁÉÍÓÚáéíóúÑñ0-9 .&-]++$");

    private static final int LONGITUD_MINIMA = 2;
    private static final int LONGITUD_MAXIMA = 30;

    public VehiculoMarca {

        if (valor == null || valor.isBlank()) {
            throw InvalidaMarcaExcepcion.becauseValueIsEmpty();
        }

        valor = valor.trim();

        if (valor.length() < LONGITUD_MINIMA
                || valor.length() > LONGITUD_MAXIMA
                || !PATRON.matcher(valor).matches()) {
            throw InvalidaMarcaExcepcion.becauseFormatIsInvalid();
        }
    }
}