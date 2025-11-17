package com.proyecto.demo.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Min;
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
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_producto;

    @NotNull(message = "El nombre del producto no puede estar vacío")
    @Size(min = 2, max = 50, message = "El nombre debe tener entre 2 y 50 caracteres")
    private String nomProducto;

    @NotNull(message = "El precio del producto es obligatorio")
    @Min(value = 100, message = "El precio mínimo debe ser 100")
    private Integer precioProducto;

    @NotNull(message = "El stock es obligatorio")
    @Min(value = 0, message = "El stock no puede ser negativo")
    private Integer stockProducto;

    @NotNull(message = "La descripción es obligatoria")
    @Size(min = 5, max = 100, message = "La descripción debe tener entre 5 y 100 caracteres")
    private String descripcionProducto;

    @NotNull(message = "La fecha de vencimiento es obligatoria")
    private String fechaVencimiento;

    @NotNull(message = "El tipo de producto es obligatorio")
    private String tipoProducto;

    @NotNull(message = "La medida del producto es obligatoria")
    private String medidaProducto;

    @ManyToOne
    @JoinColumn(name = "Id_proovedor_fk_producto")
    @NotNull(message = "El proveedor es obligatorio")
    private Proveedor proveedor;
}
