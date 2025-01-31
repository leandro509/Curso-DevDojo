/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Minterfaces.dominio;

/**
 *
 * @author leandro
 */
public interface DataLoader {
    public static final int MAX_DATA_SIZE = 10;
    
    void load();
    
    default void checkPermission() {
        System.out.println("Fazendo checagem de permissoes");
    }
    
    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieve MaxDataSize na interface");
    } 
}
