from mp3_player import MP3Player
from aac_player import AACPlayer

class AACAdapter(MP3Player):
    def __init__(self, aacPlayer: AACPlayer):
        self.aacPlayer = aacPlayer

    def play(self):
        self.aacPlayer.playAAC()