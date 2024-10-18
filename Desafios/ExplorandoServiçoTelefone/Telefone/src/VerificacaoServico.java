import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        
        // Verifica se o serviço está contratado
        boolean servicoContratado = false;
        for (int i = 1; i < partes.length; i++) {
            if (partes[i].trim().equalsIgnoreCase(servico)) {
                servicoContratado = true;
                break;
            }
        }

        // Saída do resultado
        System.out.println(servicoContratado ? "Sim" : "Nao");
        
        scanner.close();
    }
}