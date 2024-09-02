/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bintroducaometodos.dominio;

/**
 *
 * @author leandro
 */
public class Calculadora {
    
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }
    
    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }
    public void multiplicarDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }
    
    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
        return 0;
    } 
        return num1/num2;
    }
    
    public double divideDoisNumeros2(double num1, double num2) {
        if (num2 != 0) {
        return num1/num2;
    }
    return 0;
        
    }
    
    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if(num2 == 0 ) {
            System.out.println("Nao exsite divisao por Zero");
            return;
        }
        System.out.println(num1/num2);
    }
    public void alteraDoisNumeros(int numero1, int numero2) {
    numero1 = 99;
    numero2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + numero1);
        System.out.println("Num2 " + numero2);    
                
    }
    
    public void somaArray(int[] numeros) {
    int soma = 0;
    for (int num: numeros) {
        soma += num;
    }
        System.out.println(soma);
    }
    
    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num: numeros) {
        soma += num;
    }
        System.out.println(soma);
    }
}
