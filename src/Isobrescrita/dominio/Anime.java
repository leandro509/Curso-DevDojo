    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Isobrescrita.dominio;

/**
 *
 * @author leandro
 */
public class Anime extends Object {
    private String nome;

    @Override
    public String toString() {
        return "Anime{" + "nome=" + nome + '}';
    }
    
   
    
    public Anime(String nome) {
        this.nome = nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
}
