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
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_pedido;

    private String Fecha_pedido;
    private String Fecha_devolucion;
    private String Observaciones_devoluciones;

    @Enumerated(EnumType.STRING)
    private EstadoPedido Estado_pedido;

    public enum EstadoPedido {
        activo, inactivo
    }

    @ManyToOne
    @JoinColumn(name = "Id_cliente_fk_pedido")
    private Cliente cliente;
}
