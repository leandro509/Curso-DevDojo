/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bintroducaometodos.test;
import Bintroducaometodos.dominio.Calculadora;
/**
 *
 * @author leandro
 */
public class CalculadoraTest04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);
        System.out.println("Dentro CalculadoraTest04");
        System.out.println("Num1 " + a);
        System.out.println("Num2 " + b);
    }
}
