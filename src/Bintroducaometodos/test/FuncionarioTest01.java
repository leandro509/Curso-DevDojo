/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bintroducaometodos.test;
import Bintroducaometodos.dominio.Funcionario;


public class FuncionarioTest01 {
    public static void main(String[] args) {
        
    
    Funcionario funcionario = new Funcionario();
    funcionario.setNome("Leandro");
    funcionario.setIdade(19);
    funcionario.setSalarios (new double[]{1200, 987.32, 2000});
    
    
    funcionario.imprime();
        System.out.println("Media " + funcionario.getMedia());
    

    }
}
