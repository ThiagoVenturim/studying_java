package Cap_2;
class StreamingSong{
    String title;
    String artist;
    int duration;

    void play(){
        System.out.println("Playing Song");
    }

    void printDetails(){
        System.out.println(" This is " + title + " by " + artist );
    }
}

class StreamingSongTestDrive{
    public static void main(String[] args) {
        StreamingSong song= new StreamingSong();
        song.artist = "The Beatles";
        song.title = "Come Together";
        song.play();
        song.printDetails();
    }
}