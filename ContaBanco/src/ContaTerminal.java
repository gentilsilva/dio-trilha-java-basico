import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;        

        System.out.print("Por favor, digite o número da conta: ");
        numero = Integer.parseInt(scan.nextLine());

        System.out.print("Por favor, digite a agência: ");
        agencia = scan.nextLine();

        System.out.print("Por favor, digite o seu nome: ");
        nomeCliente = scan.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
        "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque." );
    }
}