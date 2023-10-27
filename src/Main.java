import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1.işlem : Bakiye Öğrenme\n"
                + "2.işlem : Para Çekme\n" + "3.işlem : Para Yatırma\n"
                + "Çıkış için 'q' a basınız.";
        System.out.println("*************************************");
        System.out.println(islemler);
        System.out.println("*************************************");
        System.out.print("İşlemi seçiniz : ");

        while (true){
            String islem = scanner.next();
            if (islem.equals("q")){
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if ( islem.equals("1")){
                System.out.println("Bakiyeniz = " + bakiye);
            }
            else if ( islem.equals("2")){
                System.out.print("Çekmek istediğiniz tutar : ");
                int tutar = scanner.nextInt();

                if (bakiye - tutar < 0){
                    System.out.println("Yetersiz Bakiye");
                }
                else {
                    bakiye -= tutar;
                    System.out.println("Yeni Bakiyeniz : " + bakiye);
                }

            } else if (islem.equals("3")){
                System.out.print("Yatırmak istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                bakiye += tutar;
                System.out.println("Yeni Bakiyeniz : " + bakiye);

            }
            else {
                System.out.println("Geçersiz işlem...");
            }

        }


    }
}