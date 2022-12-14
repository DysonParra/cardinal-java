/*
 * @fileoverview    {ServicioUsuario} se encarga de realizar tareas específicas.
 *
 * @version         2.0
 *
 * @author          Dyson Arley Parra Tilano <dysontilano@gmail.com>
 *
 * @copyright       Dyson Parra
 * @see             github.com/DysonParra
 *
 * History
 * @version 1.0     Implementación realizada.
 * @version 2.0     Documentación agregada.
 */
package com.project.dev.backend.servicio;

import com.project.dev.backend.servicio.dto.UsuarioDTO;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * TODO: Definición de {@code ServicioUsuario}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
public interface ServicioUsuario extends ServicioGenerico<UsuarioDTO> {

    public List<UsuarioDTO> obtenerEntidades(String id) throws Exception;

    public Page<UsuarioDTO> obtenerEntidades(Pageable pageable) throws Exception;

    public Page<UsuarioDTO> query(String query, Pageable pageable);
}
