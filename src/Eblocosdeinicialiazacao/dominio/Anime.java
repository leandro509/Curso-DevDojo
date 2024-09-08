/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Eblocosdeinicialiazacao.dominio;

/**
 *
 * @author leandro
 */
public class Anime {
    private String nome;
    private int[] episodios;
   
    {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    
    public Anime(String nome) {
        this.nome = nome;
    }

    
    
    public Anime() {
        for(int episodio: this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
    
    
}

