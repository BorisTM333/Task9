import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int liczba = scanner.nextInt();
        if (liczba % 7 == 0) {
            System.out.println("Liczba 7 jest dzielnikiem liczby " + liczba + " :)");
        }
        else {
            System.out.println("Liczba 7 nie jest dzielnikiem liczby " + liczba + " :(");
        }

        scanner.close();
    }
}