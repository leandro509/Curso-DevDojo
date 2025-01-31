/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minterfaces.test;
import Minterfaces.dominio.DataLoader;
import Minterfaces.dominio.DatabaseLoader;
import Minterfaces.dominio.FileLoader;
/**
 *
 * @author leandro
 */
public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        
        databaseLoader.load();
        fileLoader.load();
        
        databaseLoader.remove();
        fileLoader.remove();
        
        databaseLoader.checkPermission();
        fileLoader.checkPermission();
        
        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
       
        
    }
}
