from mp3_player import MP3Player

class MusicPlayer:
    def __init__(self, player: MP3Player):
        self.player = player

    def play(self):
        self.player.play()