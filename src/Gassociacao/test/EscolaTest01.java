/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gassociacao.test;
import Gassociacao.dominio.Professor;
import Gassociacao.dominio.Escola;
/**
 *
 * @author leandro
 */
public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor1, professor2};    
        Escola escola = new Escola("Konoha", professores);
        
        escola.imprime();
        
        
    }
}
