import java.util.Scanner;

public class VoidOlarakDizininGonderilenelemaniniIkiKatiylaDegistir {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a[]={1,2,3,4};
        int el,i;
        System.out.println("Hangi eleman degissin:");
        el=inp.nextInt();
        degis(a,el);

        System.out.println("Dizinin Yeni hali:");
        for(i=0;i<a.length;i++){
            System.out.printf("%d ",a[i]);
        }
    }

    private static void degis(int[] a, int e) {
        a[e]=a[e]*2;
    }
}
