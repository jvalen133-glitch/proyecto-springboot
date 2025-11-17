package com.proyecto.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "venta")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_venta;

    private String Fecha_venta;
    private Integer Total_venta;

    @Enumerated(EnumType.STRING)
    private EstadoVenta Estado_venta;

    public enum EstadoVenta {
        activo, inactivo
    }

    @ManyToOne
    @JoinColumn(name = "Id_usuario_fk_venta")
    private Usuario usuario;
}
