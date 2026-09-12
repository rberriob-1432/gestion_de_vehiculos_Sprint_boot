package com.rabb.vehiculosmanejo.dominio.ov;

import com.rabb.vehiculosmanejo.dominio.excepciones.InvalidaCategoriaExcepcion;

import java.util.regex.Pattern;

public record VehiculoCategoria(String valor) {

    private static final Pattern PATRON =
            Pattern.compile("^[A-Za-zÁÉÍÓÚáéíóúÑñ]+(?: [A-Za-zÁÉÍÓÚáéíóúÑñ]+)*$");

    private static final int LONGITUD_MINIMA = 3;
    private static final int LONGITUD_MAXIMA = 30;

    public VehiculoCategoria {

        if (valor == null || valor.isBlank()) {
            throw InvalidaCategoriaExcepcion.becauseValueIsEmpty();
        }

        valor = valor.trim();

        if (valor.length() < LONGITUD_MINIMA
                || valor.length() > LONGITUD_MAXIMA
                || !PATRON.matcher(valor).matches()) {
            throw InvalidaCategoriaExcepcion.becauseFormatIsInvalid();
        }
    }
}