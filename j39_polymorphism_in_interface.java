interface mycamera2 {
    void snap();

    void recordvideo();
}

interface mediaplayer {
    void playmusic();

    void playvideo();
}

class myphone2 {
    public void callnumber(int number) {
        System.out.println("calling..... " + number);
    }

    public void pickcall(int number) {
        System.out.println("ringing....." + number);

    }
}

class mysmartphone2 extends myphone2 implements mycamera2, mediaplayer {
    public void snap() {
        System.out.println("taking snap......");
    }

    public void recordvideo() {
        System.out.println("recording video.....");
    }

    public void playmusic() {
        System.out.println("playing music.....");
    }

    public void playvideo() {
        System.out.println("playing video.....");
    }
}

public class j39_polymorphism_in_interface {
    public static void main(String[] args) {
        mycamera2 mc = new mysmartphone2();
        mc.snap();
        mc.recordvideo();
        mediaplayer mp = new mysmartphone2();
        mp.playmusic();
        mp.playvideo();
    }

}
