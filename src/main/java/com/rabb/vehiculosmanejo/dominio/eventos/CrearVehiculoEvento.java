package com.rabb.vehiculosmanejo.dominio.eventos;

import com.rabb.vehiculosmanejo.dominio.entidad.VehiculoEntidad;

import java.util.HashMap;
import java.util.Map;
import lombok.Getter;

@Getter
public final class CrearVehiculoEvento extends DomainEvent {

    private static final String EVENT_NAME = "vehiculo.created";

    private final VehiculoEntidad vehiculo;

    public CrearVehiculoEvento(final VehiculoEntidad vehiculo) {
        super(EVENT_NAME);
        this.vehiculo = vehiculo;
    }

    @Override
    public Map<String, String> payload() {

        final Map<String, String> payload = new HashMap<>();

        payload.put("id", vehiculo.getId().valor().toString());
        payload.put("placa", vehiculo.getPlaca().valor());
        payload.put("marca", vehiculo.getMarca().valor());
        payload.put("modelo", String.valueOf(vehiculo.getModelo().valor()));
        payload.put("version", vehiculo.getVersion().valor());
        payload.put("color", vehiculo.getColor().valor());
        payload.put("numPuestos", String.valueOf(vehiculo.getNumPuestos().valor()));
        payload.put("numPuertas", String.valueOf(vehiculo.getNumPuertas().valor()));
        payload.put("combustible", vehiculo.getCombustible().valor());
        payload.put("kilometros", String.valueOf(vehiculo.getKilometros().valor()));
        payload.put("cilindraje", String.valueOf(vehiculo.getCilindraje().valor()));
        payload.put("categoria", vehiculo.getCategoria().valor());
        payload.put("estatus", vehiculo.getEstatus().name());

        return payload;
    }
}