import java.util.Scanner;

public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusica reprodutor = new ReprodutorMusica();
        reprodutor.start();

        Scanner scanner = new Scanner(System.in);
        // Adicione aqui a lógica para controlar a reprodução (pausar, retomar, parar)
        // Por exemplo:
        while (true) {
            System.out.print("Digite 'p' para pausar, 'r' para retomar ou 's' para sair: ");
            String comando = scanner.nextLine();
            if (comando.equals("p")) {
                reprodutor.pausar();
            } else if (comando.equals("r")) {
                reprodutor.retomar();
            } else if (comando.equals("s")) {
                break;
            }
        }
    }
    static class ReprodutorMusica {
        private boolean tocando = true;
        private boolean pausado = false;

        public void start() {
            Thread thread = new Thread(() -> {
                while (tocando) {
                    synchronized (this) {
                        while (pausado) {
                            try {
                                wait(); // Aguarda até ser notificado para continuar
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                        System.out.println("A sua música está tocando");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

                System.out.println("Sua música parou");
            });

            thread.start();
        }

        public synchronized void pausar() {
            pausado = true;
        }

        public synchronized void retomar() {
            pausado = false;
            notify();
        }
    }
}
