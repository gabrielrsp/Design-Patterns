package creationalPatterns.abstractFactory;

public class PopularCarFactory extends  CarFactory{

    @Override
    public Wheel mountWheel() {
        return new WheelSmall();
    }

    @Override
    public AudioPlayer mountAudioPlayer() {
        return new RadioPlayer();
    }
}
