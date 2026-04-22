package ZZDoptional.test;

import ZZDoptional.domain.Manga;
import ZZDoptional.repositorio.MangaRepository;

import java.util.ArrayList;
import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        //Procurar manga por titulo, se o titulo existir atualizar o titulo da manga
        //2 - Procurar por ID, caso o id nao exista, lancar uma excecao
        //3 - Procurar por titulo, caso nao exista, criar um novo manga
        Optional<Manga> mangaByTitle = MangaRepository.findByName("Boku no Hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);

        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByName("Drifters")
                .orElse(new Manga ("Drifters", 3, 20));
        System.out.println(newManga);
    }

}
