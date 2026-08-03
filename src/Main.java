import java.util.Scanner;

class Main{
    static void main() {
        System.out.println("Try e catch");
        Scanner  teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double primeiroNumero = teclado.nextDouble();

        System.out.println("Digite outro número: ");
        double segundoNumero = teclado.nextDouble();


        System.out.println(primeiroNumero);
        System.out.println(segundoNumero);

    }
}