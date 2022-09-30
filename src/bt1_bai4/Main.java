package bt1_bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the a:");
        double a=scanner.nextDouble();
        System.out.println("Enter the b:");
        double b =scanner.nextDouble();
        System.out.println("Enter the c:");
        double c =scanner.nextDouble();
        PTbachai ptBacHai=new PTbachai(a,b,c);
        System.out.println("Delta = "+ptBacHai.getDiscriminant());
        if (ptBacHai.getDiscriminant()>0){
            System.out.println("PT có hai nghiệm phân biệt");
            System.out.println(ptBacHai.getRoot1());
            System.out.println(ptBacHai.getRoot2());
        } else if (ptBacHai.getDiscriminant()==0) {
            System.out.println("X1=X2="+ptBacHai.getNghiem());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
