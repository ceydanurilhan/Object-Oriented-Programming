import java.util.Scanner;

public class OgrenciSayisiBilinmedigindeOrtalama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        float ort;
        int top=0,count=0,notlar = 0;

        while (notlar != -1){
            notlar=inp.nextInt();
            if(notlar!=-1){
                top+=notlar;
                count++;
            }
        }
        ort=top/count;
        System.out.println("Ortalama:"+ort);
    }
}
