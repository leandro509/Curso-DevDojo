/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gassociacao.test;
import Gassociacao.dominio.Jogador;
import Gassociacao.dominio.Time;

/**
 *
 * @author leandro
 */
public class JogadorTest03 {
    public static void main(String[] args) {
            Jogador jogador = new Jogador("Cafu");
            Jogador jogador2 = new Jogador("Pele");
            Time time = new Time("Brasil");
            Jogador[] jogadores = {jogador, jogador2};
            
            jogador.setTime(time);
            jogador2.setTime(time);
            time.setJogadores(jogadores);
            
            System.out.println("--- Jogador ---");
            
            jogador.imprime();
            
            System.out.println("--- Time ---");
            
            time.imprime();
    }
}
