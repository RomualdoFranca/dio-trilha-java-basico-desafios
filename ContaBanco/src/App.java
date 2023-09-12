import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        ContaTerminal contaTerminal = new ContaTerminal();

        // criando ojeto scanner
        Scanner scanner =  new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome: ");
        contaTerminal.nomeCliente = scanner.next();

        System.out.println("Por favor, digite o número da conta: ");
        contaTerminal.numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da agência: ");
        contaTerminal.agencia = scanner.next();

        System.out.println("Por favor, digite o seu saldo: ");
        contaTerminal.saldo = scanner.nextDouble();

    
       System.out.println("Olá ".concat(contaTerminal.nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ") + contaTerminal.agencia.concat(", conta ") + contaTerminal.numero + " e seu saldo " + contaTerminal.saldo + " já está disponível para saque");
    }
}
