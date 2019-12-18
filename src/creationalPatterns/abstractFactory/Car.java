package creationalPatterns.abstractFactory;

public class Car {

    Wheel wheel;
    AudioPlayer audioPlayer;

    public Wheel getWheel() { return wheel; }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public AudioPlayer getAudioPlayer() {
        return audioPlayer;
    }

    public void setAudioPlayer(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }


}
