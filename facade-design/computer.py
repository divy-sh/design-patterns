from cpu import CPU
from memory import Memory
from gpu import GPU
class Computer:
    def __init__(self):
        self.cpu = CPU()
        self.memory = Memory()
        self.gpu = GPU()

    def start(self):
        self.cpu.freeze()
        self.memory.load()
        self.cpu.jump(23)
        self.cpu.execute("load image")
        self.gpu.render()