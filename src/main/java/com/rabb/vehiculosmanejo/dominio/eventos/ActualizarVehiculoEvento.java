package com.rabb.vehiculosmanejo.dominio.eventos;

import com.rabb.vehiculosmanejo.dominio.entidad.VehiculoEntidad;

import java.util.Map;

import lombok.Getter;

@Getter
public final class ActualizarVehiculoEvento extends DomainEvent {

    private static final String EVENT_NAME = "vehiculo.updated";

    private final VehiculoEntidad vehiculo;

    public ActualizarVehiculoEvento(final VehiculoEntidad vehiculo) {
        super(EVENT_NAME);
        this.vehiculo = vehiculo;
    }

    @Override
    public Map<String, String> payload() {

        return Map.ofEntries(
                Map.entry("id", vehiculo.getId().valor().toString()),
                Map.entry("placa", vehiculo.getPlaca().valor()),
                Map.entry("marca", vehiculo.getMarca().valor()),
                Map.entry("modelo", String.valueOf(vehiculo.getModelo().valor())),
                Map.entry("version", vehiculo.getVersion().valor()),
                Map.entry("color", vehiculo.getColor().valor()),
                Map.entry("numPuestos", String.valueOf(vehiculo.getNumPuestos().valor())),
                Map.entry("numPuertas", String.valueOf(vehiculo.getNumPuertas().valor())),
                Map.entry("combustible", vehiculo.getCombustible().valor()),
                Map.entry("kilometros", String.valueOf(vehiculo.getKilometros().valor())),
                Map.entry("cilindraje", String.valueOf(vehiculo.getCilindraje().valor())),
                Map.entry("categoria", vehiculo.getCategoria().valor()),
                Map.entry("estatus", vehiculo.getEstatus().name())
        );
    }
}