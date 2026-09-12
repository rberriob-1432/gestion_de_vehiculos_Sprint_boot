package com.rabb.vehiculosmanejo.dominio.entidad;
import com.rabb.vehiculosmanejo.dominio.enums.VehiculoEstatus;
import com.rabb.vehiculosmanejo.dominio.ov.VehiculoCategoria;
import com.rabb.vehiculosmanejo.dominio.ov.VehiculoCilindraje;
import com.rabb.vehiculosmanejo.dominio.ov.VehiculoColor;
import com.rabb.vehiculosmanejo.dominio.ov.VehiculoCombustible;
import com.rabb.vehiculosmanejo.dominio.ov.VehiculoKilometros;
import com.rabb.vehiculosmanejo.dominio.ov.VehiculoMarca;
import com.rabb.vehiculosmanejo.dominio.ov.VehiculoModelo;
import com.rabb.vehiculosmanejo.dominio.ov.VehiculoNumPuestos;
import com.rabb.vehiculosmanejo.dominio.ov.VehiculoNumPuertas;
import com.rabb.vehiculosmanejo.dominio.ov.VehiculoPlaca;
import com.rabb.vehiculosmanejo.dominio.ov.VehiculoVersion;

import java.util.Objects;
import com.rabb.vehiculosmanejo.dominio.ov.VehiculoId;

public final class VehiculoEntidad {

    private final VehiculoId id;

    private VehiculoPlaca placa;
    private VehiculoMarca marca;
    private VehiculoModelo modelo;
    private VehiculoVersion version;
    private VehiculoColor color;
    private VehiculoNumPuestos numPuestos;
    private VehiculoNumPuertas numPuertas;
    private VehiculoCombustible combustible;
    private VehiculoKilometros kilometros;
    private VehiculoCilindraje cilindraje;
    private VehiculoCategoria categoria;
    private VehiculoEstatus estatus;

    public VehiculoEntidad(
            final VehiculoId id,
            final VehiculoPlaca placa,
            final VehiculoMarca marca,
            final VehiculoModelo modelo,
            final VehiculoVersion version,
            final VehiculoColor color,
            final VehiculoNumPuestos numPuestos,
            final VehiculoNumPuertas numPuertas,
            final VehiculoCombustible combustible,
            final VehiculoKilometros kilometros,
            final VehiculoCilindraje cilindraje,
            final VehiculoCategoria categoria,
            final VehiculoEstatus estatus
    ) {
        this.id = Objects.requireNonNull(id);
        this.placa = Objects.requireNonNull(placa);
        this.marca = Objects.requireNonNull(marca);
        this.modelo = Objects.requireNonNull(modelo);
        this.version = Objects.requireNonNull(version);
        this.color = Objects.requireNonNull(color);
        this.numPuestos = Objects.requireNonNull(numPuestos);
        this.numPuertas = Objects.requireNonNull(numPuertas);
        this.combustible = Objects.requireNonNull(combustible);
        this.kilometros = Objects.requireNonNull(kilometros);
        this.cilindraje = Objects.requireNonNull(cilindraje);
        this.categoria = Objects.requireNonNull(categoria);
        this.estatus = Objects.requireNonNull(estatus);
    }


    public VehiculoId getId() {
        return id;
    }
    public VehiculoPlaca getPlaca() {
        return placa;
    }

    public VehiculoMarca getMarca() {
        return marca;
    }

    public VehiculoModelo getModelo() {
        return modelo;
    }

    public VehiculoVersion getVersion() {
        return version;
    }

    public VehiculoColor getColor() {
        return color;
    }

    public VehiculoNumPuestos getNumPuestos() {
        return numPuestos;
    }

    public VehiculoNumPuertas getNumPuertas() {
        return numPuertas;
    }

    public VehiculoCombustible getCombustible() {
        return combustible;
    }

    public VehiculoKilometros getKilometros() {
        return kilometros;
    }

    public VehiculoCilindraje getCilindraje() {
        return cilindraje;
    }

    public VehiculoCategoria getCategoria() {
        return categoria;
    }

    public VehiculoEstatus getEstatus() {
        return estatus;
    }
}