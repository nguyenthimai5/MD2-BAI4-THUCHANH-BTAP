package bt2_bai4;

import java.util.Date;

public class StopWatch {
    private long startTime;
    public long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();

    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

   public  void  start(){
        this.startTime=System.currentTimeMillis();
   }
   public  void  end(){
        this.endTime=System.currentTimeMillis();
   }
   public long getElapsedTime(){
        long time =this.endTime-this.startTime;
        return  time;
   }
}
