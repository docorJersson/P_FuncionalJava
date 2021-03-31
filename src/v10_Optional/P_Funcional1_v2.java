package v10_Optional;

import java.util.Comparator;
import java.util.Optional;
import java.util.Random;

public class P_Funcional1_v2 {

    Random random = new Random();

    public static void main(String[] args) {
        new P_Funcional1_v2();
    }

    public P_Funcional1_v2() {

        Flujo.proveer(10, this::randomInt)
                .filtra(valor -> valor >= 0)
                .ordenar(Integer::compareTo)
                .transformar(NumberUtils::elevarAlCuadrado)
                //EL ARGUMENTO QUE YO LE PASABA A LA LAMDA SE PASA COMO PARÁMETRO DE CONSTRUCTOR DE LA LAMDA 
                // VALOR-> NEW DESCRIPCION::(VALO)
                .transformar(Descripcion::new)
                .actuar(System.out::println)
                .transformar(Descripcion::getValue)
                //.reducir(0, Integer::sum);
                .max(Comparator.naturalOrder()).ifPresentOrElse(valor -> System.out.println("Valor Maximo: " + valor.doubleValue()), () -> System.out.println("Valor Vacio"));
        //Colocamos un optional para capturar las exepciones de nullos, podriamos poder retornar un null facilmente pero con un Optional podemos tratar todas las exepciones
        ;

    }

    private int randomInt() {
        return random.nextInt(10);
    }

    private Integer getValorEmpy() {
        return random.nextInt(900);
    }
}
