from room import Room
from light import Light
from light_off_command import LightOffCommand
from light_on_command import LightOnCommand

def main():
    room1 = Room()
    light1 = Light("light 1")
    lightOff = LightOffCommand(light1)
    lightOn = LightOnCommand(light1)

    room1.setCommand(lightOn)
    room1.executeCommand()
    room1.setCommand(lightOff)
    room1.executeCommand()
    

main()