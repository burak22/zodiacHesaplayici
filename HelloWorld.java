import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum yılı giriniz: ");
        int birth = input.nextInt();
        int mod = birth%12;
        String zodiac = "";
        switch(mod){
            case 0:
                zodiac = "Maymun";
                break;
            case 1:
                zodiac = "Horoz";
                break;
            case 2:
                zodiac = "Köpek";
                break;
            case 3:
                zodiac = "Domuz";
                break;
            case 4:
                zodiac = "Fare";
                break;
            case 5:
                zodiac = "Öküz";
                break;
            case 6:
                zodiac = "Kaplan";
                break;
            case 7:
                zodiac = "Tavşan";
                break;
            case 8:
                zodiac = "Ejderha";
                break;
            case 9:
                zodiac = "Yılan";
                break;
            case 10:
                zodiac = "At";
                break;
            case 11:
                zodiac = "Koyun";
                break;
            default:
                System.out.println("Hatalı Giriş yaptınız.");
        }
        System.out.println("Çin Zodyağınız: " + zodiac);

    }
}