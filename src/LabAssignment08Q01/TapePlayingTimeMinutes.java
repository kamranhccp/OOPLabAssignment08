package LabAssignment08Q01;

public class TapePlayingTimeMinutes extends PublicationBook{
    protected int playingTimeMinutes;

    public TapePlayingTimeMinutes(String publicationTitle, long publicationPrice, int playingTimeMinutes){
        super(publicationTitle, publicationPrice);

        this.playingTimeMinutes = playingTimeMinutes;
    }

    public void setPlayingTimeMinutes(int pTimeMin){
        playingTimeMinutes = pTimeMin;
    }

    public int getPlayingTimeMinutes(){
        return playingTimeMinutes;
    }

    public void tapeDisplay(){
        super.publicationBDisplay();
        System.out.println("Playing Time in Minutes: " + playingTimeMinutes);
    }
}
