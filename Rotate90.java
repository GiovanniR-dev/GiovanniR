import java.util.Locale;
import java.util.Scanner;


public class teste1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);



        int[][] matriz = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int n=matriz.length;
        int [][] rotacion= new int[n][n];

        //para rotacionar 90 graus
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotacion[j][n-i-1]=matriz[i][j];
            }
        }

        //mostrar matriz rotacionada
        System.out.println("Matriz rotacionada:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(rotacion[i][j]+" ");
            }
            System.out.println();
        }

    }

}
