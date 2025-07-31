package Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

        private static void criarNovoArquivo() throws IOException{
            File file = new File("arquivo\\teste.txt");
            try {
              boolean isCriado =  file.createNewFile();
              System.out.println("Arquivo criado " + isCriado);
            } catch (IOException e) {
                e.printStackTrace();
                throw e;
            }
        }

        /*Deixando o catch em branco voce esta ignorando a excecao
        e nao esta avisando ninguem que ela esta acontecendo.
        Evitar colocar logica de negocio no catch.
        */
}
