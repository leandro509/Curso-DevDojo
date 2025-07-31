package Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch(ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        }catch (RuntimeException e) {
            System.out.println("Dentro da RuntimeException");
        }
        //Nao podemos colocar um tipo mais generico a frente dos outros catches.
        //Quando utilizamos multiplos catches devem ser do tipo mais especifico para o mais generico.

        try{
            talvezLanceException();
        }catch(SQLException | IOException e)  {
            e.printStackTrace();
        }
        //nao pode fazer isso quando tem classes na mesma linha de heranca.
        //Qual a vantagem de usar desta forma e nao colocar uma excecao mais generica ?
        //Depende para o tipo de tratamento que voce quer utilizar.
        //Quando voce tem multiplos catches, voce tem diferentes tipos de tratamentos para as excecoes
        //que estao acontecendo.

    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
