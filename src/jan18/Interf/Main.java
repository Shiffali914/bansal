package jan18.Interf;

public class Main {
    public static void main(String[] args) {

        Computer computer=new Computer();
        Iphone10 iphone10=new Iphone10();
        Iphone16 iphone16=new Iphone16();

        System.out.println("Computer Functions");
        computer.calculate();
        computer.playmusic();
        computer.takePictures();

        System.out.println();
        System.out.println("Iphone10 Functions");
        iphone10.sendText();
        iphone10.alarm();
        iphone10.makeCall();
        iphone10.calculate();
        iphone10.receivecall();
        iphone10.timer();
        iphone10.time();
        iphone10.playmusic();

        System.out.println();
        System.out.println("Iphone16 Functions");
        iphone16.alarm();
        iphone16.drawfromvoice();
        iphone16.calculate();
        iphone16.makeCall();
        iphone16.playmusic();
        iphone16.receivecall();
        iphone16.takePictures();
        iphone16.time();
        iphone16.sendText();
        iphone16.voicetotext();
        iphone16.timer();
    }
}
