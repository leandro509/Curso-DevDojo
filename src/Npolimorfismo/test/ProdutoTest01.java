/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Npolimorfismo.test;
import Npolimorfismo.dominio.Computador;
import Npolimorfismo.dominio.Televisao;
import Npolimorfismo.dominio.Tomate;
import Npolimorfismo.servico.CalculadoraImposto;
/**
 *
 * @author leandro
 */
public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------");
        CalculadoraImposto.calcularImposto(tv);
        
    }
}
