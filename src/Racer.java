//Nicol Filipchuk 206637985 and Yuval Malka 315402669

public class Racer implements Runnable {
    private static int globalId=0;
    private int id;
    private int speed;

    private Track track;
    private int distancePassed;
    private static int finishedPlaceOfRacer  = 0;

    public void setSpeed(int speed) { // if the speed isn't between 1-10 print exception
        if (speed < 1 || speed > 10) {
            System.out.println("The speed of racer " + ++globalId + " must be between 1-10");
        }
        this.speed = speed;
    }

    public Racer(int speed, Track track)  { // contractor
        setSpeed(speed);
        this.track= track;
        this.id= ++globalId;
    }
    private static String getSuffix(int number) { // for the suffix of the places

        switch (number % 10) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }
    private void go(){
        Thread.currentThread().setPriority(speed);
        distancePassed=0;
        for (int i=1; i<=100; i++){
            distancePassed++;
            System.out.println("Runner " + id + " run " + i + " meters.");
            if (distancePassed==100){
                System.out.println("Runner " + id + " run " + "100 meters.");
                finishedPlaceOfRacer ++;
                System.out.println("Runner " + id + " finished " + finishedPlaceOfRacer + getSuffix(finishedPlaceOfRacer) );
            }

        }

    }


    @Override
    public void run() {
        go();
    }
}
