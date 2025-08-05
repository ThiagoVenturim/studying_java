import java.util.Scanner;

class Palindromo {
    private String frase;

    public Palindromo(String frase) {
        this.frase = frase;
    }

    public Palindromo() {
        this.frase = "";
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public boolean Verificar() {
        String fraseNormalizada = frase.toLowerCase(); // Normaliza a frase antes de verificar
        int n = fraseNormalizada.length();

        for (int i = 0; i < n / 2; i++) {
            if (fraseNormalizada.charAt(i) != fraseNormalizada.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

public class PalindromoTestDrive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palindromo palindromo = new Palindromo();
        String frase;

        while (true) {
            frase = scanner.nextLine();

            if (frase.equals("FIM")) {
                break;
            }

            palindromo.setFrase(frase);

            if (palindromo.Verificar()) {
                System.out.println("SIM");
            } else {
                System.out.println("NAO");
            }
        }

        scanner.close(); 
    }
}
