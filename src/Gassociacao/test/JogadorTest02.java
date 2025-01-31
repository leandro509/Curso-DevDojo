/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gassociacao.test;
import  Gassociacao.dominio.Jogador;
import  Gassociacao.dominio.Time;
/**
 *
 * @author leandro
 */
public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Time time  = new Time("Selecao  Brasileira");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
