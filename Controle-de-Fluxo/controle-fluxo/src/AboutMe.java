import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {

        try {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Olá, me chamo: " + nome.toUpperCase());
        System.out.println("Digite o sobreno: " + sobrenome);
        System.out.println("Tenho: " + idade + " anos");
        System.out.println("Minha altura é: " + altura + " cm");

        scanner.close();
        
        } catch (java.util.InputMismatchException e) {
            System.err.println("O dado precisa ser númerico");
        }

        
    }
    
}
