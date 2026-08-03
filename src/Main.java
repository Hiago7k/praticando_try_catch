import java.util.Scanner;

class Main{
    static void main() {
        System.out.println("***************");
        System.out.println("Strong Password");
        System.out.println("***************");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma senha forte a senha deve conter no mínimo 8 caracteres ");
        String senhaDoUsuario = teclado.next();


        Cadastro cadastro = new Cadastro(senhaDoUsuario);

        try{
            System.out.println("Senha forte");
        }catch (SenhaInvalidaException e)
        {
            System.out.println("Erro: "+ e.getMessage());
        }


    }
}