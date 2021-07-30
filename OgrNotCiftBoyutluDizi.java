import java.util.Scanner;

public class OgrNotCiftBoyutluDizi {
    public static void main(String[] args) {
        int i,j;
        int [][]ogrNot = new int[4][3];
        Scanner inp=new Scanner(System.in);

        for(i=0;i<4;i++){
            for(j=0;j<3;j++){
                System.out.printf("%d. Ogrencinin %d inci notunu giriniz: ",i+1,j+1);
                ogrNot[i][j]=inp.nextInt();
            }
        }

        System.out.println("NOTLAR:");
        for(i=0;i<4;i++){
            for(j=0;j<3;j++){
                System.out.printf("%d. Ogrencinin %d inci notu: %d",i+1,j+1,ogrNot[i][j]);
                System.out.printf("\n");
            }
        }

    }
}
