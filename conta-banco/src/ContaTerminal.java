import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Programa simples de terminal para cadastro de conta bancária.
 */
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");

        // Entrada de dados ---------------------------------------------
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // consome a quebra de linha que ficou no buffer

        System.out.print("Por favor, digite o nome do(a) cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        // Saída formatada ---------------------------------------------
        String mensagem = String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %s já está disponível para saque.",
                nomeCliente, agencia, numero, df.format(saldo));

        System.out.println();
        System.out.println(mensagem);

        scanner.close();
    }
}
