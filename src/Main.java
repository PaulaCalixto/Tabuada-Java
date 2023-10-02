import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int numero = scanner.nextInt();
        scanner.close();
        System.out.println("Tabuada de " +numero+ ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " +i+ " = " +resultado);
        }
    }
}
