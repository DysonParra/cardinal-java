/*
 * @fileoverview    {RepositorioMercancia} se encarga de realizar tareas específicas.
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
package com.project.dev.backend.repositorio;

import com.project.dev.backend.dominio.Mercancia;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * TODO: Definición de {@code RepositorioMercancia}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
@Repository
public interface RepositorioMercancia extends JpaRepository<Mercancia, Long> {

    public List<Mercancia> findByIntIdMercancia(Long id);

    @Query("SELECT m FROM Mercancia m WHERE m.intIdMercancia LIKE CONCAT('%', :strBusqueda, '%')")
    public Page<Mercancia> buscarEntidades(@Param("strBusqueda") String strBusqueda, Pageable pageable);
}
