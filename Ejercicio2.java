import java.io.*;
import java.util.*;

class Ejercicicio2 {
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        //Leer el valor de N
        int N = Integer.parseInt(leer.readLine());
        
        //Leer la matriz de N enteros
        String[] numeros = leer.readLine().split(" ");
        int[] matriz = new int[N];
        for (int i = 0; i < N; i++) {
            matriz[i] = Integer.parseInt(numeros[i]);
        }
        
        // ncontrar el valor máximo y mínimo en la matriz
        int maxValor = Arrays.stream(matriz).max().getAsInt();
        int minValor = Arrays.stream(matriz).min().getAsInt();
        
        //Calcular la diferencia absoluta máxima
        int diferenciaMaxima = maxValor - minValor;
        
        System.out.println(diferenciaMaxima);
    }
}