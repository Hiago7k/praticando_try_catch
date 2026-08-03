import java.util.Scanner;

class Main{
    static void main() {

        System.out.println("Try e catch");
        Scanner  teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int  primeiroNumero = teclado.nextInt();
        System.out.println("Digite outro número: ");
        int segundoNumero = teclado.nextInt();

        try{

        int resultado = primeiroNumero / segundoNumero;
            System.out.println("Resultado da div" + resultado);
        }catch (ArithmeticException  e)
        {
            System.out.println("Erro");
        }
    }
}