import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe scanner
        //Exibir as mensagens para o usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem conta criada

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência ! ");
        numero = scanner.nextInt();

        System.out.println("Digite a Agência ! ");
        agencia = scanner.next();

        System.out.println("Agora digite o saldo ! ");
        saldo = scanner.nextDouble();

        scanner.nextLine(); // Limpar o buffer após a leitura do saldo

        System.out.println("Digite o nome completo do titular da conta:");
        nomeCliente = scanner.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}