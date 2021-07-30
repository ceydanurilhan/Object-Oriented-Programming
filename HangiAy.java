import java.util.Scanner;

public class HangiAy {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int ay=0;
        String name;

        System.out.println("Ay numarasini giriniz:");
        ay=inp.nextInt();

        switch (ay){
            case 1:
                name="ocak";
                System.out.println(name);
                break;
            case 2:
                name="subat";
                System.out.println(name);
                break;
            case 3:
                name="mart";
                System.out.println(name);
                break;
            default:
                System.out.println("Gecersiz");
        }
    }
}
