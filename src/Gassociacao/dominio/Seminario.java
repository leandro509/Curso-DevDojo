/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gassociacao.dominio;

/**
 *
 * @author leandro
 */
public class Seminario {
    private String nome;
    private Aluno[] alunos;
    private Local local;
    
    public Seminario(String nome, Local local) {
        this.nome = nome;
        this.local = local;
    }

  

    public Seminario(String nome, Aluno[] alunos, Local local) {
        this.nome = nome;
        this.alunos = alunos;
        this.local = local;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
    
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;    
    }
    
    public Aluno[] getAlunos() {
        return alunos;
    }
    
    public void setAluno(Aluno[] alunos) {
        this.alunos  = alunos;
    }
    
}
