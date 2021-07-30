import java.util.Scanner;

public class DizininGonderilenelemaniniIkiKatiylaDegistir {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int a[]={1,2,3,4};
        int el,i;
        System.out.println("Hangi eleman degissin");
        el=inp.nextInt();
        a[el]=degis(a[el]);

        System.out.println("Dizinin Yeni hali:");
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    private static int degis(int i) {
        return i*2;
    }
}
