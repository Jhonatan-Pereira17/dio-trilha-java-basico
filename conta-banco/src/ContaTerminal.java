import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Por favor digite o numero da conta ");
        int Conta = ler.nextInt();

        ler.nextLine();
        
        System.out.println("Por favor digite o nome da agência: ");
        String Agencia = ler.nextLine();

        System.out.println("Por favor digite o seu nome: ");
        String nome = ler.nextLine();

        System.out.println("Informe seu saldo atual: ");
        double saldo = ler.nextDouble();

        System.out.println(" Olá "+ nome + " obrigado por criar uma conta em nosso banco, sua agencia é " +Agencia+ ", conta "+Conta+ " e seu saldo de "+saldo+ " Já está disponivel para saque " );

    }
}
