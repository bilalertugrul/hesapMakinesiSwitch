import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int number1, number2, result, operation;

        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayiyi Giriniz : ");
        number1 = input.nextInt();

        System.out.print("2. Sayiyi Giriniz : ");
        number2 = input.nextInt();

        System.out.print("(1)Toplama, (2)Cikarma, (3)Carpma, (+)Bolme : ");
        operation = input.nextInt();

        switch(operation) {
            case 1:
                result = number1 + number2;
                System.out.println(result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println(result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println(result);
            case 4:
                result = number1 / number2;
                System.out.println(result);
                break;
            default :
                System.out.println("Gecersiz giris");
        }    }
}