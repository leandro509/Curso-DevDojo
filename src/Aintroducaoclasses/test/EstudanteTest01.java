/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aintroducaoclasses.test;

import Aintroducaoclasses.dominio.Estudante;


        
/**
 *
 * @author leandro
 */
public class EstudanteTest01 {
    public static void main(String[] args) {
        
        Estudante estudante = new Estudante(); 
        
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';
        
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
                
              
    }
}
