import java.util.Scanner;
public class taksimetre {
    public static void main(String[] args){
        int km;
        double perkm =2.20 , total , statrtprice = 10 ;

        Scanner input = new Scanner(System.in);
        System.out.println(" mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();

        total = (km*perkm);
        total += statrtprice;

        total = (total < 20) ? 20 : total;
        System.out.println("toplam tutar : " + total);
    }
}
