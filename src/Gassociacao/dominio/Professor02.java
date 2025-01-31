/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gassociacao.dominio;

/**
 *
 * @author leandro
 */
public class Professor02 {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;
    
    
    public Professor02(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }
    
    public Professor02(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime(){
        System.out.println("-------");
        System.out.println("Professor: " + this.nome);
        if(this.seminarios == null) return;
        System.out.println("## seminarios cadastrados ##");
        for( Seminario seminario : this.seminarios) {
            System.out.println(seminario.getNome());
            System.out.println(seminario.getLocal().getEndereco());
            if (seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("** alunos **");
            for (Aluno aluno : seminario.getAlunos()){
                System.out.println("Aluno : " + aluno.getNome() + " idade: " + aluno.getIdade());
            }
        }    
        
    }
    
    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
    
  
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
        
    }
    
    public String getEspecialidade(){
        return especialidade;
    }
}
