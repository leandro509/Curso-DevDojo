package Xserializacao.test;

import Xserializacao.dominio.Aluno;
import Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "William Suane", "12342121");
        Turma turma = new Turma("Maratona Java Virado no Jiraya em Breve Ricos");
        aluno.setTurma(turma);
        //Quando voce esta lendo um objeto serializado o  java nao vai utilizar o construtor
        //Por isso cuidar se for utilizar heranca, como ele vai chamar o super se o construtor nao eh executado
        serializar(aluno);
        deserializar();
    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pastaSerializacao/aluno.ser");
        //Quando voce esta serializando, voce esta transformando um objeto em um array de bytes
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    private static void deserializar() {
        Path path = Paths.get("pastaSerializacao/aluno.ser");
        //Quando voce esta serializando, voce esta transformando um objeto em um array de bytes
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        }catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
