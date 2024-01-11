public class Racer implements Runnable {
    private static int globalId=1;
    private int id;
    private int speed;
    private Track track;
    private int distancePassed;

    public Racer(int speed, Track track){
        this.speed= speed;
        this.track= track;
        this.id= ++globalId;
    }
    private void go(){
        Thread.currentThread().setPriority(speed);
        distancePassed=0;
        for (int i=1; i<100; i++){
            distancePassed++;
            System.out.println("Runner " + id + " run " + i + " meters.");
            if (distancePassed==100){
                track.setFinishedRacers(track.getFinishedRacers() + 1);
                System.out.println("Runner " + id + " finished " + "100 meters.");
                int finishPlace = track.getTotalRacers()- track.getFinishedRacers() + 1;
                System.out.println("Runner " + id + " finished " + finishPlace +"st." );
            }

        }

    }


    @Override
    public void run() {
        go();
    }
}
