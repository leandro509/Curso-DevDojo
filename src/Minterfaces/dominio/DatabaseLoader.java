/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minterfaces.dominio;

/**
 *
 * @author leandro
 */
public class DatabaseLoader implements  DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissoes do banco de dados");
    }
    
     public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieve MaxDataSize dentro da classe DatabaseLoader");
    } 
    
    
    
    
}
