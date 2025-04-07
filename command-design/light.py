class Light:
    def __init__(self, name: str):
        self.isOn = False
        self.name = name
    
    def turnOn(self):
        self.isOn = True
        print(f"Light {self.name} turned on")
    
    def turnOff(self):
        self.isOn = False
        print(f"Light {self.name} turned off")