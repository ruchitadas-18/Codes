class phone {
    public void showtime() {
        System.out.println("time is 10 pm...");
    }

    public void on() {
        System.out.println("turning on phone......");
    }
}

class smartphone extends phone {
    public void welcome() {
        System.out.println("welcome......");
    }

    @Override
    public void on() {
        System.out.println("turning on smartphone.....");
    }
}

public class j35_dynamic_method_dispatch {
    public static void main(String[] args) {
        // phone obj = new phone(); // yes it is allowed
        // smartphone obj2 = new smartphone(); // allowed
        phone obj = new smartphone(); // allowed //run time polymorphism
        // smartphone obj2 = new phone(); // not allowed
        obj.showtime();
        obj.on();
        // obj.welcome(); //not allowed the method of smartphone

    }

}
