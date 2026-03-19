package Zgenerics.test;


import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
       List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
       List<Gato> gatos = List.of(new Gato(), new Gato());
        printConsulta(gatos);
        printConsulta(cachorros);
    }
    //Type erasure
    //extends somente le o elemento, nao da para adicionar, pois o compilador nao sabe o tipo da lista
    private static void printConsulta(List<? extends Animal> animals ) {
        for(Animal animal : animals){
            animal.consulta();
        }
    }
    private static void printConsultaAnimal(List<? super Animal> animals ){
        animals.add(new Cachorro());
        animals.add(new Gato());

    }
}
