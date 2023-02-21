import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("crie o numero de seu usuario");
            int numero = scan.nextInt();

            System.out.println("digite o numero de sua agencia");
            String Agencia = scan.next();
            scan.nextLine();

            System.out.println("digite o seu nome completo");
            String NomeCliente = scan.nextLine();
            
            System.out.println("saldo para primeiro deposito");
            Double Saldo = scan.nextDouble();

            System.out.println("Olá "+NomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+numero+" e seu saldo "+Saldo+" já está disponível para saque");
        }
    }
}
