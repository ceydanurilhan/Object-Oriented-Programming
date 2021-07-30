import java.util.Scanner;

public class OrtalamaHesaplama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int i,ort,top=0,notlar;

        for(i=0;i<10;i++){
            notlar=inp.nextInt();
            top+=notlar;
        }
        ort=top/10;

        System.out.println(ort);
    }
}
