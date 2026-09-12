package com.rabb.vehiculosmanejo.dominio.ov;

import com.rabb.vehiculosmanejo.dominio.excepciones.InvalidaVersionExcepcion;

import java.util.regex.Pattern;

public record VehiculoVersion(String valor) {

    private static final Pattern PATRON =
            Pattern.compile("^[A-Za-zÁÉÍÓÚáéíóúÑñ0-9 .-]++$");

    private static final int LONGITUD_MAXIMA = 30;

    public VehiculoVersion {

        if (valor == null || valor.isBlank()) {
            throw InvalidaVersionExcepcion.becauseValueIsEmpty();
        }

        valor = valor.trim();

        if (valor.length() > LONGITUD_MAXIMA
                || !PATRON.matcher(valor).matches()) {
            throw InvalidaVersionExcepcion.becauseValueIsInvalid();
        }
    }
}