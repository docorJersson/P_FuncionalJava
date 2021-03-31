package p_funcional1;

import java.util.ArrayList;
import java.util.List;

public class P_Funcional1 {

    public static void main(String[] args) {
        new P_Funcional1();
    }

    public P_Funcional1() {
        //CREO UNA LISTA
        List<Integer> numeros = crearLista();
        System.out.println(numeros);
        
        //FILTRO NÚMEROS PARES
        List<Integer> pares = filtrarPares(numeros);
        System.out.println(pares);
        
        List<Integer> cuadrados=cuadrados(pares);
        System.out.println(cuadrados);
        
        List<Integer> mostrados=mostrarLista(cuadrados);
        
        int suma=sumaCuadrados(mostrados);
        System.out.println("SUMA DE CUADRADOS :"+suma);
    }

    public List<Integer> crearLista() {
        return List.of(0, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144);
    }

    public List<Integer> filtrarPares(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();
        //RECORRO LA LISTA Y AGREGO A LA NUEVA LISTA LOS VALORES PARES 
        for (Integer n : numeros) {
            if (n % 2 == 0) {
                resultado.add(n);
            }
        }
        return resultado;
    }
    
    public List<Integer> cuadrados(List<Integer> pares)
    {
        List<Integer> cuadrados=new ArrayList<>();
        
        //RECORRO LA LISTA Y AGREGO A LA NUEVA LISTA LOS VALORES al cuadrado
        pares.forEach(n -> {
            cuadrados.add(n*n);
        });
        return cuadrados;
        
    }
    
    private List<Integer> mostrarLista(List<Integer> cuadrados)
    {        
        cuadrados.forEach(n -> {
            System.out.println(n);
        });
        return cuadrados;
    }
    
    private int sumaCuadrados(List<Integer> cuadrados)
    {
        int suma=0;
       for(Integer n:cuadrados)
       {
           suma+=n;
       }
       return suma;
    }

}
