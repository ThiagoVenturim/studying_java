package Cap_2;
class Dog{
    int size;
    String breed;
    String name;  //variaveis de instancia

    void bark(){  
        System.out.println("Ruff! Ruff!"); // metodo
    }
}

class DogTestDrive{ // classe de teste
    public static void main(String[] args){
        Dog d = new Dog(); //cria um objeto Dog
        d.size= 40; //atribui valor a variavel de instancia
        d.bark(); //chama o metodo bark
    }
}