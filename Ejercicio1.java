import java.io.*;
import java.util.*;

class Ejercicio1 {  
    public static void main (String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        //Leer el tamaño de la lista
        int tamano = Integer.parseInt(leer.readLine());
        
        //Leer los números de la lista
        String[] numeros = leer.readLine().split(" ");
        
        //Contar las ocurrencias de cada número
        Map<Integer, Integer> contador = new HashMap<>();
        for (String numStr : numeros) {
            int num = Integer.parseInt(numStr);
            contador.put(num, contador.getOrDefault(num, 0) + 1);
        }
        
        //Encontrar el número que aparece el máximo número de veces
        int maxOcurrencias = 0;
        int resultado = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entrada : contador.entrySet()) {
            int num = entrada.getKey();
            int ocurrencias = entrada.getValue();
            if (ocurrencias > maxOcurrencias || (ocurrencias == maxOcurrencias && num > resultado)) {
                maxOcurrencias = ocurrencias;
                resultado = num;
            }
        }
        
        System.out.println(resultado);
    }  
}