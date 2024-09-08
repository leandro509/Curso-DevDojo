/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eblocosdeinicialiazacao.test;
import Eblocosdeinicialiazacao.dominio.Anime;
/**
 *
 * @author leandro
 */
public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        
        for (int episodios : anime.getEpisodios()) {
            System.out.print(episodios + " ");
        }
    }
}
