/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Npolimorfismo.dominio;



/**
 *
 * @author leandro
 */
public class Tomate extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.06; 
    private String dataDeValidade;
    public Tomate(String nome, double valor) {
         super(nome, valor);
     }
    
     @Override
    public double calcularImposto() {
        System.out.println("Calculando o imposto do tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
    
    
}
