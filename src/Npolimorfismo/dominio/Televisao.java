/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Npolimorfismo.dominio;

/**
 *
 * @author leandro
 */
public class Televisao extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.21;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }
    
    @Override 
    public double calcularImposto() {
        System.out.println("Calculando Imposto da Televisao");
        return  this.valor * IMPOSTO_POR_CENTO;
    }
}
