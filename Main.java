import java.util.Scanner;

public class Main {
    static boolean isPolindrom(int number) {
        int temp = number, reversNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reversNumber = (reversNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reversNumber) {

            System.out.println(number + " Sayısı Polindrom Bir Sayıdır.");
            return true;
        } else {
            System.out.println(number + " Sayısı Polindrom Bir Sayı Değildir.");
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz= ");
        int sayı = scanner.nextInt();
        System.out.println(isPolindrom(sayı));
    }
}