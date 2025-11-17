package com.proyecto.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "detalle_venta")
public class DetalleVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_detalle_venta;

    private Integer Cantidad_deta_venta;
    private Integer Preciounitario_deta_venta;
    private Integer Subtotal_deta_venta;
    private Integer Descuento_deta_venta;

    @ManyToOne
    @JoinColumn(name = "Id_venta_fk_detalle_venta")
    private Venta venta;

    @ManyToOne
    @JoinColumn(name = "Id_producto_fk_detalle_venta")
    private Producto producto;
}
