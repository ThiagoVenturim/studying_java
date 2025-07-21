package Cap_3;

class Dog{
    String name;

    public static void main(String[] args){

        Dog dog1 = new Dog(); // cria um objeto dog e o acessa
        dog1.bark();
        dog1.name = "Bart";

        Dog [] myDogs = new Dog[3]; //cria arrys Dog  e insere alguns dogs neles 
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Fred"; //acessa Dogs usando referencia do arrys
        myDogs[1].name = "Marge";

        System.out.println(" last dos´s name is ");
        System.out.println(myDogs[2].name);
        
        int x= 0;
        while( x < myDogs.length){
            myDogs[x].bark();
            x=x+1;
        }
    }
    public void bark(){
        System.out.println( name +" says Ruff!");
    }

    public void eat(){}

    public void chaseCat(){}

}