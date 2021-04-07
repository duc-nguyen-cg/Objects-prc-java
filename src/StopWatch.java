public class StopWatch {
    private long startTime, endTime;

    public StopWatch(){
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime(){
        return this.startTime;
    }

    public long getEndTime(){
        return this.endTime;
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return (this.endTime - this.startTime);
    }
}

class RunStopWatch{
    public static void main(String[] args){
        StopWatch timer = new StopWatch();
        timer.start();
        for (int i = 0; i < 100000; i++){
            System.out.println(i+"\t");
        }
        timer.stop();
        System.out.println("The elapsed time is "+timer.getElapsedTime()+" milliseconds");
    }
}
