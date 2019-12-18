package creationalPatterns.abstractFactory;

public class LuxuryCarFactory extends CarFactory {

    @Override
    public Wheel mountWheel() {
        return new WheelBig();
    }

    @Override
    public AudioPlayer mountAudioPlayer() {
        return new CDPlayer();
    }

}
