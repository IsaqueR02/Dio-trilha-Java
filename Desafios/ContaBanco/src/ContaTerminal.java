import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try{
        //TODO:Conhecer e importar a classe Scanner
        Scanner conta = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuário
        int numero;
        double Saldo;
        String agencia;
        String NomeCliente;
        
        //Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o seu nome:");
        NomeCliente = conta.nextLine();
        System.out.println("Por favor, digite o número da Agência:");
        agencia = conta.nextLine();
        System.out.println("Por favor, digite o número da Conta:");
        numero = conta.nextInt();
        System.out.println("Por favor, digite o valor do saque:");
        Saldo = conta.nextDouble();

        //Exibir a mensagem conta criada
        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, ");
        System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo " + Saldo);
        System.out.println("já está disponível para saque.");
        } 
        catch (InputMismatchException e) {
            System.out.println("Os campos conta e saldo precisam ser numericos.");
        }
    }
}