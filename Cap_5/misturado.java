package Cap_5;
public class misturado {
    public static void main(String[] args) {
        int x = 0;
        int y = 30;
        for(int outher = 0 ; outher < 3  ;outher++){
            for( int inner = 4; inner > 1 ; inner--){
                x+=1;
                y-=2;
                if(x==6){
                    break;
                }
                x+=3;        
            }
            y-=2;
        }
        System.out.println( x + " " + y);
    }
}