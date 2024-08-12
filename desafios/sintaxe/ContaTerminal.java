import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0f;

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o numero da conta do cliente: ");
            numero = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o numero da agencia do cliente: ");
            agencia = scanner.nextLine();

            System.out.println("Digite o nome do cliente: ");
            nomeCliente = scanner.nextLine();

            System.out.println("Digite o saldo do cliente: ");
            saldo = Math.ceil(scanner.nextFloat());

            System.out.format("Numero da conta: %d\nNumero da agencia: %s\nNome do cliente: %s\nSaldo do cliente: %.2f",
                    numero, agencia, nomeCliente, saldo);
        } catch (Exception e) {
            System.out.println("Erro, verifique o tipo das variáveis");
            e.printStackTrace();
        }

        scanner.close();
    }
}
