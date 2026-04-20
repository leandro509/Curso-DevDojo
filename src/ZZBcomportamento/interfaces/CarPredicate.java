package ZZBcomportamento.interfaces;

import ZZBcomportamento.dominio.Car;

@FunctionalInterface
public interface CarPredicate {
    //anonimas, funções, conciso
    //Qualquer interface funcional, nós podemos utilizar lambdas
    boolean test(Car car); //Esse eh o contrato da lambda, nesse caso tem que retornar um boolean e receber um carro
    //(parametro) -> <expressao>
    //(Car car) -> car.getColor().equals("green");
}
