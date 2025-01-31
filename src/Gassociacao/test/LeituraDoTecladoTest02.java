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
public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("o grande software de previsao do futuro");
        System.out.println("digite a sua pergunta e eu responderei sim ou nao");
        String pergunta = scan.nextLine();
        if  (pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        }else{
            System.out.println("NAO");
        }
            
    }
}
