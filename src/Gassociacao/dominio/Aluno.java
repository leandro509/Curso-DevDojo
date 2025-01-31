/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gassociacao.dominio;

/**
 *
 * @author leandro
 */
public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;
    
    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade  = idade;
    }
    
    public void setNome(){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void  setIdade(){
        this.idade = idade;
    }
    
    public int  getIdade(){
        return idade;
    }
    
    public void setSeminario(Seminario seminario){
        this.seminario = seminario;
    }
    
    public Seminario getSeminario(){
        return seminario;
    }
            
}
