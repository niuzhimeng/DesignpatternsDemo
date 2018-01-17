package thread;

import java.time.LocalDate;
import java.util.concurrent.*;

class MyThread1 implements Runnable {
    private String name;

    public MyThread1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "运行  :  " + i);
            try {
                Thread.sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

public class MyThread {

    public static void main(String[] args) {
        LocalDate local = LocalDate.now();
        int i = local.lengthOfMonth();
        System.out.println(i);
        System.out.println(local.getDayOfWeek());

    }
}

















