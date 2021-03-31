package v9_Method_Avanzado;

import v8_Method_References.*;
import java.util.Random;

public class P_Funcional1_v2 {

    Random random = new Random();

    public static void main(String[] args) {
        new P_Funcional1_v2();
    }

    public P_Funcional1_v2() {

        Integer total = Flujo.proveer(10, this::randomInt)
                .filtra(NumberUtils::esPrimo)
                .ordenar(Integer::compareTo)
                .transformar(NumberUtils::elevarAlCuadrado)
                //EL ARGUMENTO QUE YO LE PASABA A LA LAMDA SE PASA COMO PARÁMETRO DE CONSTRUCTOR DE LA LAMDA 
                // VALOR-> NEW DESCRIPCION::(VALO)
                .transformar(Descripcion::new)
                .actuar(System.out::println)
                .transformar(Descripcion::getValue)
                .reducir(0, Integer::sum);

        System.out.println("SUMA DE CUADRADOS :" + total);
    }

    private int randomInt() {
        return random.nextInt(50);
    }
}
