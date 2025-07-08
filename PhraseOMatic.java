public class PhraseOMatic{
    public static void main(String[] args){
        String[] wordListOne={"agnostic", "opinionated", "voice activated", "haptically", "driven", "extensible", "reactive", "agent based", "functional", "AI enabled", "strongly typed"}; 
        String[] wordListTwo={"loosely coupled", "six sigma", "asynchronous", "event driven", "public", "IoT", "cloudnative", "service oriented", "containerized","serverless", "microservices", "distributed ledger"};
        String[] wordListThree={"framework", "library", "DSL", "REST API", "repository", "pipeline", "servicemesh", "architecture", "perspective", "design", "orientation"};
        
        int oneLength= wordListOne.length; //quantas palavras tem o array 
        int twoLength= wordListTwo.length;
        int threeLength= wordListThree.length;

        java.util.Random randomGenerator =new java.util.Random(); // Cria um objeto Random para gerar números aleatórios
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2= randomGenerator.nextInt(twoLength);
        int rand3= randomGenerator.nextInt(threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3]; //Cria a frase aleatória
        System.out.println("What we need is a " + phrase + "."); // Exibe a frase gerada
    }   
}