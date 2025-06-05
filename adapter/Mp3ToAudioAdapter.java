package adapter;

public class Mp3ToAudioAdapter extends AudioPlayer {
    private Mp3Player player;

    public Mp3ToAudioAdapter(Mp3Player player) {
        this.player = player;
    }

    @Override
    public void playAudio() {
        this.player.play();
    }
}
