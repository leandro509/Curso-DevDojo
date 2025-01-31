/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hheranca.test;
import Hheranca.dominio.Endereco;
import Hheranca.dominio.Pessoa;
import Hheranca.dominio.Funcionario;
/**
 *
 * @author leandro
 */
public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua  3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("1111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        
        Funcionario funcionario = new Funcionario("Oda nobunaga");
        funcionario.setCpf("22222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("-------------");
        funcionario.imprime();
        
        
        
        
        
    }
}
