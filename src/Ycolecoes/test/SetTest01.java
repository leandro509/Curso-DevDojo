package Ycolecoes.test;

import Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        //Set nao permite elementos duplicados dentro da colecao
        //LinkedHashSet mantem a ordem de insercao
        Set<Manga> mangas = new HashSet<>();

        mangas.add(new Manga(5L, "Attack on titan", 19.9));
        mangas.add(new Manga(1L,"Berserk", 9.5));
        mangas.add(new Manga(4L,"Hellsing Ultimate", 3.2));
        mangas.add(new Manga(3L, "Pokemon", 11.2));
        mangas.add(new Manga(2L,"Dragon ball Z", 2.99));


        for(Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
