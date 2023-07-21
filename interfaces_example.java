interface Mycamera{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("good morning");
    }
    // void recordin4k(); throws an error because we will have to implement this method.
    default void record4k(){
        greet();
        System.out.println("recording in 4k....");
    }
}
interface Mywifi{
     String[]  getNetwork();
     void connectToNetwork(String network);

}
class Mycellphone{
    void callnumber(int phonenumber){
        System.out.println("calling.." + phonenumber);

    }
    void pickcall(int number){
        System.out.println("connecting...." + number);
    }
}
class Mysmartphone extends Mycellphone implements Mycamera,Mywifi{
    public void takesnap(){
        System.out.println("taking snap..");
    }
    public void recordvideo(){
        System.out.println("recording video...");
    }
    // public void record4k(){
    //     System.out.println("recording in 4k and take snap...");
    // }
    public String[] getNetwork(){
        System.out.println("Getting the list of networks..");
        String[] list = {"gktr","sktr","aktr"};
        return list;
    }
    public void connectToNetwork(String network){
        System.out.println("connectingto...." + network);
    }

}
public class interfaces_example {
    public static void main(String[] args) {
        Mysmartphone ms = new Mysmartphone();
        ms.callnumber(83);
        ms.pickcall(83);
        ms.takesnap();
        ms.recordvideo();
        ms.record4k();
        //ms.greet(); //throws an error

        String[] arr = ms.getNetwork();
        for(String item:arr){
            System.out.println(item);
        }
        
    }
    
}
