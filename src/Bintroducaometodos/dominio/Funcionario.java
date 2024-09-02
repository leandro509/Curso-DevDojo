/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bintroducaometodos.dominio;

/**
 *
 * @author leandro
 */
public class Funcionario {

    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println("-------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
            for (double salario : salarios) {
                System.out.print(salario + " ");
            }
        
        imprimeMediaSalario();
    }

    public void imprimeMediaSalario() {
        if (salarios == null) {
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }

        media /= salarios.length;

        System.out.println("\nMedia salarial " + media);
    }

}
