import java.util.Scanner;

public class  ders1 {
    public static void main(String[] args) {

        String userName = "patika", passWord = "java123";
        String select, yenisifre = "";
        String evet = "1" , hayır ="2";

        boolean sifretekrarı =false;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız :");
        userName = scan.nextLine();

        System.out.print("Şifreniz :");
        passWord = scan.nextLine();


        if (userName.equals("patika") && (passWord.equals("java123"))) {
            System.out.println("Giriş Yaptınız . ");
        } else if (!userName.equals("patika") && (!passWord.equals("java123"))) {
            System.out.println("kullanıcı adı ve şifre hatalı  . ");
        } else if (!userName.equals("patika")&& (passWord.equals("java123"))) {
            System.out.println("kullanıcı adı hatalı tekrar deneyiniz . ");

        } else if (userName.equals("patika") &&(!passWord.equals("java123"))) {
            System.out.println("Hatalı şifre girdiniz. Tekrar deneyiniz.");

            System.out.print("Şifrenizi Değiştirmek İster Misiniz ? 1- EVET   -  2 - HAYIR : ");
            select = scan.nextLine();
            if (select.equals("hayır")||(select.equals("2"))){
                System.out.println("Sayfadan Ayrılıyorsunuz...");}
            if (select.equals("evet") || select.equals("1")) {
               // Bu while döngüsünü ilerleyen konulardan ekledim . şifre yanlış ise tekrar sorsun diye.
                while (!sifretekrarı) {
                System.out.print("Yeni şifrenizi giriniz: ");
                yenisifre = scan.nextLine();
                { if (!yenisifre.equals("java123"))
                        { System.out.println("yeni şifre oluşturuldu .");
                            sifretekrarı = true;}
                else {
                    System.out.println("hatalı giriş önceki şifre ile aynı  ");


                }}}}}}}
