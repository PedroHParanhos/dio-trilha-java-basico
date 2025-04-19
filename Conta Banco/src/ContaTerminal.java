import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO: Conhecer e importar a classe Scanner

        // Exibir as mensagens para o usuário

        // Obter pela scanner os valores digitados no terminal

        // Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Por favor, digite o número da Agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da conta");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta
                + " e o seu saldo " + saldo + " já está disponível para saque!");
    }
}
