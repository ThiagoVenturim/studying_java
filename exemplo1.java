int size = 27; //criei uma variavel  do tipo inteira chamada size com valor 27
String name = "Fibo"; //criei uma variavel do tipo string chamada name com valor Fibo
Dog myDog = new Dog(size, name); //criei um objeto do tipo Dog chamado myDog, passando size e name como parametros
x= size -5; //criei uma variavel x do tipo inteira, que recebe o valor de size - 5
if(x < 15){ // se x for menor que 15    myDog.bark(); // o cachorro late
}
while(x > 3){ // enquanto x for maior que 3
    myDog.play(); // o cachorro brinca
}

int[] numList = {2, 4, 6, 8}; // criei um array de inteiros chamado numList com os valores 2, 4, 6 e 8
System.out.print("Hello"); // imprimo Hello no console
System.out.print("Dog: " + name); // imprimo Dog: Fibo no console
Strinf num = "8"; // criei uma string chamada num com o valor 8
int z= Integer.parseInt(num); // converto a string num para inteiro e atribuo a z
try{  // tento ler um arquivo
    readTheFile("My File.txt"); // chamo a função readTheFile passando o nome do arquivo
} catch (FileNotFoundException ex){ // se o arquivo não for encontrado, captura a exceção
    System.out.print("File not found"); // imprime File not found no console
}