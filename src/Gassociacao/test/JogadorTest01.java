/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gassociacao.test;
import Gassociacao.dominio.Jogador;
/**
 *
 * @author leandro
 */
public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador  jogador1 = new Jogador("Pele");
        Jogador  jogador2 = new Jogador("Romario");
        Jogador  jogador3 = new Jogador("Cafu");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        
        for(Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
