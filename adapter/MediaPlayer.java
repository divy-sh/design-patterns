package adapter;

public class MediaPlayer {
    private AudioPlayer player;

    public MediaPlayer(AudioPlayer player) {
        this.player = player;
    } 

    public void play() {
        player.playAudio();
    }
}
