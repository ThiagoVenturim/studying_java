package Cap_4;
public class Mix4{
    int counter = 0;

    public static void main(String[] args){
        int count= 0;
        Mix4[] mixer = new Mix4[20];
        int i = 0 ;
        while(i < 19){
            mixer[i] = new Mix4();
            mixer[i].counter = mixer[i].counter + 1;
            count ++;
            count = count + mixer[i].maybeNew(i);
            i++;
        }
        System.out.println(count + " "+ mixer[1].counter) ;
    }
    public int maybeNew(int index){
        if(index < 1){
            Mix4 mix = new Mix4();
            mix.counter++;
            return 1;
        }else{
            return 0;
        }
    }
}