/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author sandr
 */
@Entity
@Table(name="cliente", catalog="test_ito")
public class Cliente {
    @Id
    @Column
    private Integer id_cliente;
    @Column
    private String primer_nombre;
    @Column
    private String segundo_nombre;
    @Column
    private String primer_apellido;
    @Column
    private String segundo_apellido;
    @Column
    private String tipo_documento;
    @Column
    private String numero_documento;
    @Column
    private String direccion;

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
