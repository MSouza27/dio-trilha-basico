
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner bc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!: ");
        agencia = bc.nextLine();

        System.out.println("Por favor, digite o número da Conta!: ");
        numero = bc.nextInt();

        bc.nextLine();

        System.out.println("Por favor, digite o seu Nome!: ");
        nomeCliente = bc.nextLine();

        System.out.println("Por favor digite o saldo Disponível!: ");
        saldo = bc.nextDouble();

        System.out.println("**************************************");

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque." );
        
        bc.close();
    }
}
