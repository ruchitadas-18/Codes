class threadrunnable1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 500) {
            System.out.println("i am thread1 not thread2");
            i++;
        }
    }

}

class threadrunnable2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 500) {

            System.out.println("I am thread2 not thread1");
            i++;
        }
    }

}

public class j46_Thread_Using_Runnable_Interface {
    public static void main(String[] args) {
        threadrunnable1 bullet1 = new threadrunnable1();
        Thread gun1 = new Thread(bullet1);
        threadrunnable2 bullet2 = new threadrunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();

    }

}
