import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ilk sayı");
        double number1 = scan.nextDouble();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("ikinci sayı");
        double number2 = scan2.nextDouble();
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Yapmak istediğiniz işlemi seçiniz");
        System.out.println("1-toplama \n2-çıkartma \n3-çarpma \n4-bölme ");
        int operation = scan3.nextInt();


       if (operation==1){
            System.out.println(number1+number2);
        }
        else if (operation==2){
            System.out.println(number1-number2);
        }
        else if (operation==3){
            System.out.println(number1*number2);
        }
        else if (operation==4){
            System.out.println(number1/number2);
        }else {
           System.out.println("Geçersiz işlem");
       }
    }
}