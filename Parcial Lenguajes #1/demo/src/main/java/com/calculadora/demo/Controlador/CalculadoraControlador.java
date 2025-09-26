package com.calculadora.demo.Controlador;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Calculadora")

public class CalculadoraControlador {
    
    @GetMapping("/sumar")
    public int sumar(@RequestParam int num1, int num2) {
    return num1 + num2;
    }

    @GetMapping("/resta")
    public int resta(@RequestParam int num1, int num2) {
    return num1 - num2;
    }

    @GetMapping("/Multi")
    public int multiplicar(@RequestParam int num1, int num2) {
    return num1 * num2;
    }

    @GetMapping("/division")
    public int division(@RequestParam double num1, double num2) {
    return division(num1, num2);
    }
}