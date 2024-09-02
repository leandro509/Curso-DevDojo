/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aintroducaoclasses.test;

import Aintroducaoclasses.dominio.Professor;

/**
 *
 * @author leandro
 */
public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        
        professor.nome = "Mestre Kami";
        professor.idade = 140;
        professor.sexo = 'M';
        
        System.out.println("Nome " + professor.nome + " idade: " + professor.idade + " sexo:" + professor.sexo);
    }
}
