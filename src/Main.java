import java.util.Scanner;
//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
public class Main {
    public static void main(String[] args) {
        int k;
        Scanner scn=new Scanner(System.in);

        System.out.println("Sayı giriniz: ");
        k=scn.nextInt();

        int a=1,b=1;
        System.out.println("4'ün kuvvetleri");
        for (int i=1;i<=k;i*=4){
            System.out.println("4'ün "+a+". kuvveti "+i+".");
            a++;
        }
        System.out.println("");
        System.out.println("5in kuvvetleri");
        System.out.println("");
        for (int i=1;i<=k;i*=5){
            System.out.println("5'in "+b+". kuvveti "+i+".");
            b++;
        }

    }
}
