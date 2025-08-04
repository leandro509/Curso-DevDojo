package Oexception.exception.test;

import Oexception.exception.dominio.Leitor1;
import Oexception.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        //O que esse Try com recursos esta fazendo ?
        //Ele ta se encarregando de tomar conta de fechar a conexao dessa variavel de referencia.
        //Voce so pode colocar objetos dentro do try with resources que implementem
        // a interface closeable ou autocloseable.
        try(Leitor1 leitor1 = new Leitor1();
            Leitor2 leitor2 = new Leitor2()){
        //Eu posso declarar quantas variaveis eu quiser, so preciso que elas implementem a interface closeable.
        //Eles sao fechados na ordem inversa do que foram declarados.
        }catch(IOException e) {
            e.printStackTrace();
        }
        //Quando voce usa o try with resources voce pode remover o catch e o finally
        //mas voce e obrigado a usar o throws e a excecao que esta sendo lancada.
        /*Exemplo abaixo:
        * public static void lerArquivo() throws IOException {
        try(Reader reader = new BufferedReader(new FileReader("teste.txt"))){

        }
        * */
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally{
            try{
                if(reader != null) {
                reader.close();
                }
            }catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
