package Cap_5;

import java.util.Scanner;
class SimpleStartup{
    private int[] location;
    private int numOfHits;
    private int [] grafico; 

    public SimpleStartup(int [] loc){
        location  = new int[7];
         grafico = new int[7]; 
        setLocation(loc);
        numOfHits = 0;
    }
    public void MostrarGrafico(){
        System.out.println( "|--------------------------------------------------------|");
        System.out.println( "|                                                        |");
        System.out.print( "|    ");
        for(int i = 0; i < grafico.length; i++){
            System.out.print( + grafico[i] + " | ");
        }
         System.out.print( "                   |");
         System.out.println( "\n|--------------------------------------------------------|");
    }
    public void setLocation(int[] loc){
        for(int i = 0; i < location.length; i++){
            grafico[i] = 0; // Inicializa o gráfico com zeros
            for(int j = 0; j < loc.length; j++){
                if(i == loc[j]){
                    location[i] = 1; // Define a posição como ocupada
                } 
            }
        }
    }
    
    public boolean GuessUsario(int userInput){
        if(userInput < 0 || userInput > 6){
            System.out.println(   "|  Número inválido. Tente novamente.                     |");
        }else if(location[userInput] == 1){
            numOfHits++;
            if(numOfHits== 3){
                System.out.println("|               KILL!                                    |");
                grafico[userInput] = 1;
                MostrarGrafico();
                return false;
            }else{
                System.out.println("|               HIT!                                     |");
                grafico[userInput] = 1;
                location[userInput] = 0; // Marca a posição como vazia após o acerto
            }
        }else{
            
           System.out.println(      "|              MISS!                                    |");
        }
        MostrarGrafico();
        return true; // Continua o jogo
    }
    
}

public class SimpleStartupTestDrive{
    public static void main(String[] args){
        int[] loc = {2, 3, 4};
        Scanner scanner = new Scanner(System.in);
        SimpleStartup game = new SimpleStartup(loc);
        boolean keepGoing = true;

        System.out.println("---------------Bem-Vindo ao Jogo Simple Startup----------\n ");
        System.out.println("|                          |                             |");
        System.out.println("|                          |                             |");
        System.out.println("|                          V                             |");
        System.out.println("| Você está prestes a iniciar uma aventura emocionante!  |");
        System.out.println("|--------------------------------------------------------|");
        System.out.println("| Digite um número entre 0 a 6 para começar:             |");
        do{ 
            int userInput = scanner.nextInt();
            keepGoing = game.GuessUsario(userInput);
            
        } while(keepGoing);   
        System.out.println("Obrigado por jogar!");
        scanner.close();     
    }
}