package jan18.Interf;

public class Iphone10 implements Clock,MusicPlayer,Calculator,Camera,Telephone{
    @Override
    public void calculate() {
        System.out.println("Iphone10 make calculate");
    }

    @Override
    public void takePictures() {
        System.out.println("Iphone10 can takepicture");
    }

    @Override
    public void time() {
        System.out.println("Iphone10 can show time");
    }

    @Override
    public void alarm() {
        System.out.println("Iphone10 can give alarm");
    }

    @Override
    public void timer() {
        System.out.println("Iphone10 can provide timer function");
    }

    @Override
    public void playmusic() {
        System.out.println("Iphone10 can play music");
    }

    @Override
    public void makeCall() {
        System.out.println("Iphone10 can make call");
    }

    @Override
    public void receivecall() {
        System.out.println("Iphone10 can take call");
    }

    @Override
    public void sendText() {
        System.out.println("Iphone10 can send text msg");
    }
}

