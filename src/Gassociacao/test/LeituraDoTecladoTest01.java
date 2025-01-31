/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gassociacao.test;
import  java.util.Scanner;
/**
 *
 * @author leandro
 */
public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome  = scan.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Digite M ou F para seu sexo ");
        char sexo  = scan.next().charAt(0);
        System.out.println("---------------");
        
        System.out.println("Nome " + nome);
        System.out.println("Idade " + idade);
        System.out.println("Sexo " + sexo);
        
        
    }
}
