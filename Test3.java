import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        String sex;
        int age;
        double height,weight;


        Scanner inp= new Scanner(System.in);

        /*
        People p1=new People();

        sex= inp.nextLine();
        age= inp.nextInt();
        height=inp.nextDouble();
        weight=inp.nextDouble();

        p1.setAd("Ali");
        p1.setCins(sex);
        p1.setBoy(height);
        p1.setKilo_Yas(weight,age);

        System.out.println(p1.getAd()+" "+p1.getCins()+" "+p1.getBoy()+" "+p1.getKilo()+" "+p1.getYas());

        People p2=new People("Can","Erkek",41,180,85);
        System.out.println(p2.getAd()+" "+p2.getCins()+" "+p2.getBoy()+" "+p2.getKilo()+" "+p2.getYas());

        */
        /*
        String name2,sex2;
        int age2;
        double height2,weight2;

        name2= inp.nextLine();
        sex2= inp.nextLine();
        age2= inp.nextInt();
        height2=inp.nextDouble();
        weight2=inp.nextDouble();

        People p3= new People(name2,sex2,age2,height2,weight2);
        System.out.println(p3.getAd()+" "+p3.getCins()+" "+p3.getBoy()+" "+p3.getKilo()+" "+p3.getYas());
        */

        String name3,sex3;
        int age3;
        double height3,weight3;

        name3= inp.nextLine();
        sex3= inp.nextLine();
        age3= inp.nextInt();
        height3=inp.nextDouble();
        weight3=inp.nextDouble();

        People p4=new People(name3,sex3);
        p4.setBoy(height3);
        p4.setKilo_Yas(weight3,age3);

        System.out.println(p4.getAd()+" "+p4.getCins()+" "+p4.getBoy()+" "+p4.getKilo()+" "+p4.getYas());







    }
}
