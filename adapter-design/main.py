from music_player import MusicPlayer
from aac_player import AACPlayer
from aac_adapter import AACAdapter
from mp3_player import MP3Player


def main():
    musicPlayer = MusicPlayer(MP3Player())
    musicPlayer.play()

    musicPlayer2 = MusicPlayer(AACAdapter(AACPlayer()))
    musicPlayer2.play()

main()