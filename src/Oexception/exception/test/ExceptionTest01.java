package Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

        private static void criarNovoArquivo() {
            File file = new File("arquivo\\teste.txt");
            try {
              boolean isCriado =  file.createNewFile();
              System.out.println("Arquivo criado " + isCriado);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /*Deixando o catch em branco voce esta ignorando a excecao
        e nao esta avisando ninguem que ela esta acontecendo.
        Evitar colocar logica de negocio no catch.
        */
}
