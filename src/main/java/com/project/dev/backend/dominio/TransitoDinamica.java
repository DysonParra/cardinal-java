/*
 * @fileoverview    {TransitoDinamica} se encarga de realizar tareas específicas.
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
package com.project.dev.backend.dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: Definición de {@code TransitoDinamica}.
 *
 * @author Dyson Parra
 * @since 1.8
 */
@Entity
//@Table(name = "TransitoDinamica", schema = "cardinal", catalog = "cardinal")
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class TransitoDinamica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long intIdDinamica;
    private Integer intIdCategoria;
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFechaHoraTransito;
    private Integer intPesoGeneral;
    @Column(length = 50)
    private String strPesoEjes;
    @Column(precision = 12, scale = 0)
    private Float fltVelocidad;
    private String strPlacaVehiculo;
    @Column(columnDefinition = "LONGTEXT")
    private String strBase64Placa;
    private Boolean bitBorrado;

}
