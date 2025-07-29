import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            System.out.println("Você foi transportado para o ano 3433.");
            System.out.println("Você acorda e percebe que não está mais na Terra.");
            System.out.println("A gravidade parece diferente. Está escuro lá fora.");
            System.out.println("Você está de pé em frente a uma casa.");

            System.out.println("\nEscolha uma opção:");
            System.out.println("[a] Andar em direção à casa");
            System.out.println("[b] Gritar em direção à casa");

            String escolha1 = input.nextLine().toLowerCase();

            if (escolha1.equals("a")) {
                System.out.println("\nVocê se aproxima da casa e sobe os degraus até a porta.");
                System.out.println("Está prestes a bater quando as luzes se acendem...");

                System.out.println("\nEscolha uma opção:");
                System.out.println("[a] Bater na porta");
                System.out.println("[b] Espiar pela janela");

                String escolha2 = input.nextLine().toLowerCase();

                if (escolha2.equals("a")) {
                    System.out.println("\nA porta se abre sozinha. Um robô gigante aparece e diz:");
                    System.out.println("\"Você passou no teste. Seja bem-vindo ao seu novo lar.\"");
                    System.out.println(">> O computador diz que você viverá! 🟢");
                } else {
                    System.out.println("\nAo espiar pela janela, você escorrega e cai de um penhasco escondido!");
                    System.out.println(">> Você caiu do penhasco e morreu. Desculpe... ❌");
                }

            } else if (escolha1.equals("b")) {
                System.out.println("\nVocê grita em direção à casa. Nenhuma resposta.");
                System.out.println("Mas você vê arbustos se mexendo atrás de você...");

                System.out.println("\nEscolha uma opção:");
                System.out.println("[a] Correr para os arbustos");
                System.out.println("[b] Ignorar e comer algumas frutas próximas");

                String escolha2 = input.nextLine().toLowerCase();

                if (escolha2.equals("a")) {
                    System.out.println("\nUma criatura alienígena salta e te engole inteiro.");
                    System.out.println(">> Você morreu instantaneamente. Fim trágico. ❌");
                } else {
                    System.out.println("\nVocê come algumas frutas. Elas são doces e te deixam alerta.");
                    System.out.println("Uma voz diz ao fundo: \"Peeta, é você?\"");
                    System.out.println(">> Você comeu as frutas e sobreviveu. Peeta? 🔵");
                }

            } else {
                System.out.println("\nOpção inválida! Tente novamente.");
                continue;
            }

            System.out.print("\nDeseja jogar novamente? Pressione [y] para sim: ");
            String resposta = input.nextLine().toLowerCase();
            jogarNovamente = resposta.equals("y");
            System.out.println();
        }

        System.out.println("Obrigado por jogar!");
        input.close();
    }
}