import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        double saldo = 200;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, entre com seu Nome: ");
        String nome = entrada.next();

        System.out.println("Agora, entre com a agência: ");
        String agencia = entrada.next();

        System.out.println("Agora, entre com o número: ");
        Integer numero = entrada.nextInt();

        System.out.println("Olá, " + nome + "! Obrigado por criar uma conta em nosso banco, sua agencia é: "
                + agencia + " conta: " + numero + " e seu saldo de $" + saldo + " já está disponível para saque.");

    }
}
