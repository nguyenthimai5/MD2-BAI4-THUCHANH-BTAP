package bt2_bai4;

import java.util.Date;


public class Main {
    public static void main(String[] args) {
    int[] arrInt=new int[10000];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i]=(int) Math.random()*10000;
        }
        StopWatch sw=new StopWatch();
        sw.start();
        for (int i = 0; i < arrInt.length-1; i++) {
            for (int j = i+1; j < arrInt.length; j++) {
                if (arrInt[i]>arrInt[j]){
                    int temp=arrInt[i];
                    arrInt[i]=arrInt[j];
                    arrInt[j]=temp;
                }
            }
        }
        sw.end();
        System.out.println("thoi gian giai thuat la :"+sw.getElapsedTime());
    }

}
