package v11_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P_Funcional1_v2 {

    Random random = new Random();

    public static void main(String[] args) {
        new P_Funcional1_v2();
    }

    public P_Funcional1_v2() {

        List<String> nombre = new ArrayList<>(List.of("JERSSON", "ZELA", "ALEXIS", "CHILON", "NUÑEZ", "SHANNEL"));

        nombre.stream().filter(n -> n.contains("L")).filter(n -> n.length() <= 6).limit(2).sorted().forEach(System.out::println);
        random.ints(20, 0, 100).boxed().distinct().sorted().map(n -> "Valor ".concat(n.toString())).forEach(System.out::println);
        System.out.println("");
        // Stream.of(2,2,5).distinct().map(this::getRandomNumbers).forEach( integerStream-> integerStream.forEach(System.out::println));

        Stream.of(2, 8, 6, 4, 7).sorted().forEach(System.out::println);
        Stream.of(2, 8, 6, 4, 7)
                .filter(n -> n > 10)
                .mapToInt(Integer::intValue)
                .average()
                .ifPresentOrElse(System.out::print, () -> System.out.println("Valor Nulo"));
        System.out.println("");
        
        Integer multiplicador = IntStream.range(1, 10).boxed()
                .reduce(8,(acumulador, valor)-> acumulador * valor);
        //.ifPresentOrElse(System.out::println, () -> System.out.println("Reduccion Inválida"));
        System.out.println(multiplicador);
        
        Integer result = 
                Stream.of(
                        new Student("Jersson ", 1),
                        new Student("Alexis ", 19),
                        new Student("Shannel", 5))
                .reduce(0,(parcial, student)-> parcial + student.getAge(), Integer::sum);
        //.ifPresentOrElse(System.out::println, () -> System.out.println("Reduccion Inválida"));
        System.out.println(result);
    }

    private Stream<Integer> getRandomNumbers(Integer size) {
        return random.ints(size, 0, 1000).boxed();
    }

    private int randomInt() {
        return random.nextInt(10);
    }

    private Integer getValorEmpy() {
        return random.nextInt(900);
    }
}
