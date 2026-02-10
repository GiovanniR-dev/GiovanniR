public class teste1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);

        int m=sc.nextInt();
        int n=sc.nextInt();
        int [][] matriz=new int[m][n];

        for(int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                matriz[i][j]=sc.nextInt();
            }

        }

        int x =sc.nextInt();
        for(int i=0;i< matriz.length;i++){
            for(int j=0;i<matriz[i].length;j++){
                if(matriz[i][j]==x){
                    System.out.println("Position "+i+","+j+":");
                    if (j>0){
                        System.out.println("left"+matriz[i][j-1]);
                    }
                    if (i>0){
                        System.out.println("up"+matriz[i-1][j]);
                    }
                    if (j<matriz[i].length-1){
                        System.out.println("right"+matriz[i][j+1]);
                    }
                    if (i<matriz.length-1){
                        System.out.println("down"+matriz[i+1][j]);
                    }
                }
            }
        }

        sc.close();
    }

}
