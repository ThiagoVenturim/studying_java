package Cap_3;
class TestArrays{
    public static void main(String[] args){
        String [] island = new String [4];
        int [] index = new int [4];
        int y=0;

        island[0] = "Bermuda";
        island[1] = "Fiji";
        island[2] = "Azorez";
        island[3] = "Cozumel";

        index[0] = 1;
        index[1] = 3; 
        index[2] = 0;
        index[3] = 2;

        int ref;
        while(y <4 ){
            System.out.print("island = ");
            ref= index[y];
            System.out.println(island[ref]);
            y= y+1;
        }
    }
}