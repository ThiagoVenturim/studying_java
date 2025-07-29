package Cap_4;

class Clok{
    private String time; //Variavel de instância

    public Clok(String time){ //Construtor
        this.time = time;
    }
     
    void setTime(String time){ //Método para definir o valor da variável de instância
         this.time = time;
    }

    String getTime(){ //Método para obter o valor da variável de instância
        return time;
    }
}
class ClokTest{
    public static void main(String[] args){
        Clok c = new Clok("");
        c.setTime("1245");
        String tod = c.getTime();
        System.out.println("The time is: " + tod);
    }
}