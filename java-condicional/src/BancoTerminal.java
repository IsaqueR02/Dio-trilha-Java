public class BancoTerminal {
    public static void main(String[] args) throws Exception {
        // Primeira execução com saldo 25 e valor solicitado 18
        double saldo = 25;
        double valorSolicitado = 18;
        if(saldo >= valorSolicitado){
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
        }
        else{
            System.out.println("Saldo insuficiente");
        }

        // Segunda execução com saldo 15 e valor solicitado 22
        saldo = 15;
        valorSolicitado = 22;

        if (saldo >= valorSolicitado) {
            saldo = saldo - valorSolicitado;
            System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
