public class DizininElemanlarininUcKatiniDondurme {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int i=0;
        a=mtd(a);
        for(i=0;i< a.length;i++){
            System.out.printf("%d ",a[i]);
        }

    }

    private static int[] mtd(int[] a) {
        int i;
        for(i=0;i<a.length;i++){
            a[i]=a[i]*3;
        }
        return a;
    }
}
