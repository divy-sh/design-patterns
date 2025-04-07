from command import Command

class Room:
    def __init__(self):
        self.command = None

    def setCommand(self, command: Command):
        self.command = command
    
    def executeCommand(self):
        self.command.execute()