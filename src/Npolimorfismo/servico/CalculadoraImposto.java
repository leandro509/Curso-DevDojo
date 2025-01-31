/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Npolimorfismo.servico;

import Npolimorfismo.dominio.Produto;
import Npolimorfismo.dominio.Tomate;

/**
 *
 * @author leandro
 */
public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preco: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof Tomate) {
            
            String dataValidade =((Tomate) produto).getDataDeValidade(); 
            
            System.out.println(dataValidade);
        }
    }
}
