public class Track {
    private int finishedRacers;
    private int totalRacers;


    public int getTotalRacers() {
        return totalRacers;
    }

    public void setFinishedRacers(int finishedRacers) {
        this.finishedRacers = finishedRacers;
    }

    public int getFinishedRacers() {
        return finishedRacers;
    }

    public Track(int finishedRacers, int totalRacers){
        this.finishedRacers= finishedRacers;
        this.totalRacers= totalRacers;
    }

}
