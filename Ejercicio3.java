import java.io.*;

class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        
        //Leer los valores de N y M
        String[] dimensiones = leer.readLine().split(" ");
        int N = Integer.parseInt(dimensiones[0]);
        int M = Integer.parseInt(dimensiones[1]);
        
        //Leer la matriz A
        int[][] matriz = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] fila = leer.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                matriz[i][j] = Integer.parseInt(fila[j]);
            }
        }
        
        //Para para almacenar el tamaño de la secuencia más larga
        int[][] dp = new int[N][M];
        int maxSecuencia = 1;
        dp[0][0] = 1;
        
        //Para la matriz y encontrar el tamaño máximo de la secuencia
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (i > 0 && matriz[i][j] > matriz[i-1][j]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i-1][j] + 1);
                }
                if (j > 0 && matriz[i][j] > matriz[i][j-1]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][j-1] + 1);
                }
                maxSecuencia = Math.max(maxSecuencia, dp[i][j]);
            }
        }
        
        System.out.println(maxSecuencia);
    }
}