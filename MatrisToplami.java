public class MatrisToplami {
    public static void main(String[] args) {
        int num1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int num2[][]={{10,20,30},{40,50,60},{70,80,90}};
        int sonuc[][];
        int i,j;
        sonuc=Topla(num1,num2);
        for(i=0;i<num1.length;i++){
            for(j=0;j<num1[0].length;j++){
                System.out.printf("%d ",sonuc[i][j]);
            }
            System.out.println("\n");
        }
    }

    private static int[][] Topla(int[][] a1, int[][] a2) {
        int k,m;
        int s[][]= new int[a1.length][a1[0].length];

        for(k=0;k< a1.length;k++){
            for(m=0;m<a1[0].length;m++){
                s[k][m]=a1[k][m]+a2[k][m];
            }
        }
        return s;
    }
}
