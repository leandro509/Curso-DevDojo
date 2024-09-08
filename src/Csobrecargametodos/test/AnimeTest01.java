/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Csobrecargametodos.test;
import Csobrecargametodos.dominio.Anime;
/**
 *
 * @author leandro
 */
public class AnimeTest01 {
    public static void main(String[] args) {
    Anime anime = new Anime();
    anime.init("Akudama Drive", "TV", 12, "Acao");
    anime.imprime();
    }
}
