/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.controlador;


import com.example.modelos.Cliente;
import com.example.repositorio.InterfaceCliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sandr
 */
//@RequestMapping
@RestController("/cliente")
public class ClienteControlador {
    
    @Autowired
    private InterfaceCliente interfacecliente;
    
    @GetMapping
    public List<Cliente> clientes(){
        return (List<Cliente>) interfacecliente.findAll();
    }
}
