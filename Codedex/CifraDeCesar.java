import java.util.Scanner;

public class CifraDeCesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cifra de César ===");

        System.out.print("Digite a mensagem: ");
        String mensagem = scanner.nextLine();

        System.out.print("Digite o valor do deslocamento (ex: 3): ");
        int deslocamento = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        System.out.print("Deseja [c]riptografar ou [d]escriptografar? ");
        String escolha = scanner.nextLine().toLowerCase();

        if (escolha.equals("d")) {
            deslocamento = 26 - deslocamento; // inverter o deslocamento
        }

        String resultado = cifraDeCesar(mensagem, deslocamento);
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }

    public static String cifraDeCesar(String texto, int deslocamento) {
        StringBuilder resultado = new StringBuilder();

        for (char caractere : texto.toCharArray()) {
            if (Character.isLetter(caractere)) {
                char base = Character.isUpperCase(caractere) ? 'A' : 'a';
                char novo = (char) ((caractere - base + deslocamento) % 26 + base);
                resultado.append(novo);
            } else {
                resultado.append(caractere); // mantém espaço e pontuação
            }
        }

        return resultado.toString();
    }
}
