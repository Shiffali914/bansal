package jan18.Interf;

public class Iphone16 extends Iphone10 implements AI{
    @Override
    public void receivecall() {
        System.out.println("iphone16 can receive call");
    }

    @Override
    public void makeCall() {
        System.out.println("iphone16 can make call");
    }

    @Override
    public void playmusic() {
        System.out.println("iphone16 can play music");
    }

    @Override
    public void timer() {
        System.out.println("iphone16 can provide timer functions");
    }

    @Override
    public void alarm() {
        System.out.println("iphone16 can set alarm");
    }

    @Override
    public void time() {
        System.out.println("iphone16 can show time");
    }

    @Override
    public void takePictures() {
        System.out.println("iphone16 can take picture");
    }

    @Override
    public void calculate() {
        System.out.println("iphone16 can calculate");
    }

    @Override
    public void sendText() {
        System.out.println("iphone16 can send text msg");
    }

    @Override
    public void voicetotext() {
        System.out.println("iphone16 can provide voice to text features");
    }

    @Override
    public void drawfromvoice() {
        System.out.println("iphone16 can provide draw from voice feature");
    }
}
