/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hheranca.test;

import Hheranca.dominio.Funcionario;

/**
 *
 * @author leandro
 */
public class HerancaTest02 {

    //0 - bloco de inicializacao estatico da superclasse executado quando a JVM carregar a classe pai
    //1 - bloco de inicializacao estatico da subclasse executado quando a JVM carregar a classe filha
    //2 - alocado espaco em memoria pro objeto da superclasse
    //3 - cada atributo de superclasse pai e criado e inicializado com valores default ou o que for passado 
    //4 - bloco de inicializacao da superclasse e executado na ordem em que aparece
    //5 - construtor e executado da superclasse 
    //6 - alocado espaco em memoria pro objeto da subclasse
    //7 - cada atributo de subclasse pai e criado e inicializado com valores default ou o que for passado da classe pai
    //8 - bloco de inicializacao da subclasse e executado na ordem em que aparece
    //9 - construtor e executado da subclasse         
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
