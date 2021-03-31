package v13_Collect;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        List<Book> books = Arrays.asList(new Book("345-89", "Sufriendo a Pedro", 2018, Genre.THERROR),
                new Book("923-45", "Los papeles por delante", 1997, Genre.THRILLER),
                new Book("978-25", "La vida de Baldomero", 2017, Genre.COMEDY),
                new Book("923-45", "Los papeles por delante", 1998, Genre.THRILLER),
                new Book("913-45", "Los papeles por delante", 1997, Genre.THRILLER),
                new Book("978-25", "La vida de Baldomero", 2018, Genre.COMEDY));

        System.out.println("\nOrdenar Avanzada");
        books.stream()
                .sorted(Comparator.comparing(Book::getIsbn).thenComparing(Book::getYearofPublication,Comparator.reverseOrder()))
                .findFirst();
        
        System.out.println("\nPartición");

        Map<Boolean, Long> resultadoParticion = books.stream()
                .collect(Collectors.partitioningBy(book -> book.getYearofPublication() < 2000, Collectors.counting()));
        resultadoParticion.forEach((llave, cuerpo) -> System.out.println(llave + " : " + cuerpo));

        System.out.println("\nContar");

        Map<Genre, IntSummaryStatistics> result = books.stream()
                .collect(Collectors.groupingBy(Book::getGenre,
                        Collectors.summarizingInt(Book::getYearofPublication))
                );
        result.forEach((llave, cuerpo) -> System.out.println(llave + " : " + cuerpo));

        System.out.println("\nAgrupamiento");

        Map<Integer, String> resultado = books.stream()
                .collect(Collectors.groupingBy(Book::getYearofPublication,
                        TreeMap::new,
                        Collectors.mapping(Book::getTittle, Collectors.joining(", ", "[", "]"))
                )
                );
        resultado.forEach((llave, cuerpo) -> System.out.println(llave + " : " + cuerpo));

        System.out.println("\n");
        TreeMap<String, Book> collect = books.stream()
                .filter(book -> book.getYearofPublication() < 2000)
                .collect(Collectors.toMap(Book::getIsbn,
                        Function.identity(),
                        (book1, book2) -> new Book(book1.getIsbn(), book1.getTittle().concat(" (+)"), book1.getYearofPublication(), book1.getGenre()),
                        () -> new TreeMap<>()
                )
                );
        collect.forEach((llave, objeto) -> System.out.println(llave + " " + objeto));

        System.out.println("");

        Book[] array = books.stream()
                .filter(book -> book.getYearofPublication() < 2000)
                .toArray(Book[]::new);
        Arrays.stream(array).forEach(System.out::println);

    }

}
