/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fmodificadorestatico.dominio;

import Eblocosdeinicialiazacao.dominio.*;

/**
 *
 * @author leandro
 */
public class Anime {
    private String nome;
    private static int[] episodios;
    //0 - bloco de inicializacao e executado quando a JVM carregar a classe
    //1 - alocado espaco em memoria pro objeto
    //2 - cada atributo de classe e criado e inicializado com valores default ou o que for passado
    //3 - bloco de inicializacao e executado
    //4 - construtor e executado     
    
    static {
        System.out.println("Dentro do bloco de inicializacao static ");
        episodios = new int[100];
        for(int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    
     static {
        System.out.println("Dentro do bloco de inicializacao static 2");   
    }
     
     static {
        System.out.println("Dentro do bloco de inicializacao static 3");   
    }
    
     {
         System.out.println("Dentro do bloco de inicializacao nao static 1");   
    }
     
    
    public Anime(String nome) {
        this.nome = nome;
    }

    
    
    public Anime() {
        for(int episodio: Anime.episodios) {
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

