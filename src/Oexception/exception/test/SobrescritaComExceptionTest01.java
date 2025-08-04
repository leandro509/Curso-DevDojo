package Oexception.exception.test;

import Oexception.exception.dominio.Funcionario;
import Oexception.exception.dominio.LoginInvalidoException;
import Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        try {
            funcionario.salvar();
        }catch(LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
        //Quando esta sobrescrevendo um metodo voce pode nao lancar nenhuma excecao,
        //voce pode lancar uma ou todas as excecoes que tiverem, voce pode adicionar
        //qualquer excecao do tipo unchecked e voce nao pode adicionar
        //excecoes mais genericas do tipo checked no throws, mais genericas do que a superclasse.
    }
}
