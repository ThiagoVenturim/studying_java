package Cap_2;
class Episode{
    int seriesNumber;
    String episodeName;

    void play(){
        System.out.println("Playing episode " + seriesNumber + " of " + episodeName);
    }
    void skipIntro(){
        System.out.println("Skipping intro..." );
    }
    void skipToNext(){
        System.out.println("Loading next episode..." );
    }
}

class EpisodeTestDrive{
    public static void main(String[] args){
        Episode episode = new Episode();
        episode.seriesNumber= 4;
        episode.play();
        episode.skipIntro();
    }
}