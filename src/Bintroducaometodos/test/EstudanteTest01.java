/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bintroducaometodos.test;
import Bintroducaometodos.dominio.Estudante;
import Bintroducaometodos.dominio.ImpressoraEstudante;
/**
 *
 * @author leandro
 */
public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        
        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';
        
        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';
        
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
        
        System.out.println("################");
        
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
        
       
    }
}
