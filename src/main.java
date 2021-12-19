import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        System.out.println("****************************************************");
        System.out.println("Mükemmel Sayı Programı");
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Sayıyı Giriniz: ");
        int sayı = scanner.nextInt();
        if (sayı == 1) {
            System.out.println("Geçersiz Sayı Değeri Girildi...Lütfen 1'den daha büyük bir sayı giriniz..."+sayı);
            System.out.println("------------------------------------------------");
            return;
        }
        if (sayı <= 0) {
            System.out.println("Sadece pozitif sayılar girilebilir."+sayı);
            System.out.println("------------------------------------------------");
            return;
        }
        int toplam = 0;
        for (int i = 1; i < sayı; i++) {
            if (sayı%i == 0) {
                toplam = toplam+i;
            }
            else{
                toplam = toplam;
            }
        }
        if (toplam == sayı) {
            System.out.println("Sayımız Mükemmel Bir Sayıdır : "+sayı);
        }
        else{
            System.out.println("Sayımız Mükemmel Bir Sayı Değildir : "+sayı);
        }
        System.out.println("----------------------------------------------------");
        System.out.println("****************************************************");
    }
}
