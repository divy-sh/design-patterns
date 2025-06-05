package adapter;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        MediaPlayer audioMediaPlayer = new MediaPlayer(audioPlayer);
        audioMediaPlayer.play();

        Mp3Player Mp3Player = new Mp3Player();
        MediaPlayer mp3MediaPlayer = new MediaPlayer(new Mp3ToAudioAdapter(Mp3Player));
        mp3MediaPlayer.play();
    }
}
