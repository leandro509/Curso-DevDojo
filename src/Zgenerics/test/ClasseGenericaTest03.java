package Zgenerics.test;

import Zgenerics.dominio.Barco;
import Zgenerics.dominio.Carro;
import Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
         List<Carro> carrosDisponiveis =  new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
         List<Barco> barcosDisponiveis =  new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

         RentalService<Carro> rentalService = new RentalService<Carro>(carrosDisponiveis);
        Carro carro = rentalService.buscarObjetoDisponivel();
        System.out.println("Usando carro por 1 mes...");
        rentalService.retornarObjetoAlugado(carro);

        RentalService<Barco> rentalService1 = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalService1.buscarObjetoDisponivel();
        System.out.println("Usando barco por 1 mes...");
        rentalService1.retornarObjetoAlugado(barco);
    }
}
