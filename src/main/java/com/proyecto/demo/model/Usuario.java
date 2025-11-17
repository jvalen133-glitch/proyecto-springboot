package com.proyecto.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_usuario;

    private String Nom_usuario;
    private String Direc_usuario;
    private Integer Salario_usuario;
    private String Fecha_ingre_usuario;
    private String Fecha_naci_usuario;
    private String Rh_usuario;
    private Integer Tel_usuario;
    private String Email_usuario;

    @Enumerated(EnumType.STRING)
    private Antiguedad antiguedad;

    public enum Antiguedad {
        viejo, nuevo
    }
}
