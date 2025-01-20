package jan18.Interf;

public class Computer implements Calculator,MusicPlayer,Camera{
    @Override
    public void calculate() {
        System.out.println("Computer calculating");
    }

    @Override
    public void takePictures() {
        System.out.println("Computer take picutres");
    }

    @Override
    public void playmusic() {
        System.out.println("computer can play music");
    }
}
