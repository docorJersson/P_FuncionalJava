package v12_StreamProyecto;


import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class P_Funcional1_v2 {

    Random random = new Random();

    public static void main(String[] args) {
        new P_Funcional1_v2();
    }

    public P_Funcional1_v2() {
//        random.ints(10,1,20)
//                .boxed()
//                .filter(valor -> valor >= 5)
//                .sorted()
//                .map(NumberUtils::elevarAlCuadrado)
//                .map(Descripcion::new)
//                .map(Descripcion::getValue)
//                .max(Comparator.naturalOrder())
//                .ifPresentOrElse(n-> System.out.println("Valor Máximo "+n) , ()->System.out.println("Valor no encontrado"));
//        
//        Integer suma =random.ints(10,1,20)
//                .boxed()
//                .filter(valor -> valor >= 5)
//                .sorted()
//                .map(NumberUtils::elevarAlCuadrado)
//                .map(Descripcion::new)
//                .peek(System.out::println)
//                .map(Descripcion::getValue)
//                .mapToInt(Integer::intValue)
//                .sum();
//           System.out.println("Suma "+suma);
//
//           Integer suma =random.ints(10,1,20)
//                .boxed()
//                .filter(valor -> valor >= 5)
//                .sorted()
//                .map(NumberUtils::elevarAlCuadrado)
//                .map(Descripcion::new)
//                .peek(System.out::println)
//                .map(Descripcion::getValue)
//                .reduce(0, Integer::sum);
//
//           System.out.println("Suma "+suma);
//        random.ints(20, 1, 20)
//                .boxed()
//                .filter(valor -> valor >= 5)
//                .distinct()
//                .sorted()
//                .map(NumberUtils::elevarAlCuadrado)
//                .map(Descripcion::new)
//                .map(Descripcion::getValue)
//                .forEach(n -> System.out.print(n + " "));
//
        List<Integer> mayores100 = random.ints(15,0,150)
                .boxed()
                .peek(System.out::println)
                .filter(valor -> valor >= 5)
                .filter(NumberUtils::esPrimo)
                .distinct()
                .collect(Collectors.toList());
               /* .peek(n -> System.out.println("\n"+n + " Valor Distinto"))
                .sorted()
                .peek(System.out::print)
                .map(NumberUtils::elevarAlCuadrado)
                .peek(n -> System.out.println("\n"+n + " Valor Transformado"))
                .anyMatch(n -> n > 100);*/
        System.out.println(mayores100);

    }

}
