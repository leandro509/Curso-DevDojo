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
public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros2(20, 2));
        System.out.println("----------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86, 0);
        
    }
}
