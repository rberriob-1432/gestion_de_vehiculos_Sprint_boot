package com.rabb.usuariomanejo.dominio.excepciones;

public class UsuarioYaExisteExcepcion extends DominioExcepcion {

    public UsuarioYaExisteExcepcion(final String mensaje) {
        super(mensaje);
    }

    public static UsuarioYaExisteExcepcion becauseCorreoYaExiste(final String correo) {
        return new UsuarioYaExisteExcepcion(
                "Ya existe un usuario registrado con el correo: " + correo
        );
    }
}