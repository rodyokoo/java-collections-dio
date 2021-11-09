package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExerciciosStramAPI {
    public static void main(String[] args){
        List<String> numerosAleaorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        /*System.out.println("Imprima todos os elementos dessa lista de String: ");
        numerosAleaorios.forEach(System.out::println);*/

        /*System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
        numerosAleaorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);*/

        /*System.out.println("Transforme esta lista de String em uma lista de números inteiros. ");
        numerosAleaorios.stream()
                .map(Integer::parseInt)
                .forEach(System.out::println);*/

        /*System.out.println("Pegue os números pares e maiores que 2 e coloque em uma lista:");
        numerosAleaorios.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0 && i > 2)
                .collect(Collectors.toList())
                .forEach(System.out::println);*/
        System.out.println("Mostre a média dos números: ");
        numerosAleaorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores ímpares: ");
        List<Integer> numerosAleatoriosInteger = numerosAleaorios.stream()
                .map((Integer::parseInt))
                .collect(Collectors.toList());
        numerosAleatoriosInteger.removeIf(i -> i % 2 != 0);
        System.out.println(numerosAleatoriosInteger);
    }
}
