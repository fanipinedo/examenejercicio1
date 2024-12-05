/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Parcialpinedo.controller;

import org.springframework.ui.Model;
import com.example.Parcialpinedo.model.Usuario;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author USUARIO
 */
@Controller
public class Usuariocontroller {

   @GetMapping("/login")
    public String mostrarFormularioLogin(Model model) {
        model.addAttribute("usuario", new Usuario()); // Añadir el objeto Usuario al modelo
        return "login"; // Retorna la vista llamada "login.html"
    }

    @PostMapping("/login")
    public String procesarLogin(@Valid Usuario usuario, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "login"; // Si hay errores, vuelve al formulario de login
        }

        // Verifica si las credenciales son correctas
        if ("admin".equals(usuario.getUsuario()) && "admin".equals(usuario.getContraseña())) {
            return "success"; // Redirige a la vista de éxito
        } else {
            model.addAttribute("error", "Usuario o contraseña incorrectos");
            return "login"; // Si las credenciales son incorrectas, vuelve al formulario
        }
    }

}
