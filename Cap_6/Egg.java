package Cap_6;
import java.util.ArrayList;

public class Egg{
    public static void main(String[] args) {
        ArrayList<Egg> myList = new ArrayList<Egg>();
        Egg egg1 = new Egg();
        myList.add(egg1);
        Egg egg2 = new Egg();
        myList.add(egg2);

        int theSize = myList.size();

        boolean isIn = myList.contains(egg1);
        int idx= myList.indexOf(egg2);
        boolean empty = myList.isEmpty();
        System.out.println("Size: " + theSize);
        System.out.println("Contains egg1: " + isIn);
        System.out.println("Index of egg2: " + idx);
        System.out.println("Is the list empty? " + empty);
        
        myList.remove(egg1);
    }
}