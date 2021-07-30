import java.util.*;
public class Test {
    public static void main(String[] args) {
        First_Class nesne1=new First_Class();
        nesne1.Display();
        Scanner inp=new Scanner(System.in);
        String girdi;
        girdi=inp.nextLine();
        nesne1.Display2(girdi);
    }
}
