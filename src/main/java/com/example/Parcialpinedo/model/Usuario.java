/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Parcialpinedo.model;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
/**
 *
 * @author USUARIO
 */
public class Usuario {
    
    @NotEmpty(message = "El campo usuario no puede estar vacío")
    private String usuario;

    @NotEmpty(message = "El campo contraseña no puede estar vacío")
    private String contraseña;

    // Getters y Setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
