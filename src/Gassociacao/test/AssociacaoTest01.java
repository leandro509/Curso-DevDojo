/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gassociacao.test;
import Gassociacao.dominio.Local;
import Gassociacao.dominio.Aluno;
import Gassociacao.dominio.Professor02;
import Gassociacao.dominio.Seminario;
/**
 *
 * @author leandro
 */
public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor02 professor = new Professor02("Barba branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};
        
        Seminario seminario = new Seminario("Onde achar one piece", alunosParaSeminario, local);
        
        Seminario[] seminariosDisponiveis = {seminario};
        
        professor.setSeminarios(seminariosDisponiveis);
        
        professor.imprime();
        
    }
}
