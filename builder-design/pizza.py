class Pizza:
    def __init__(self, base, topping, sauce):
        self.base = base
        self.topping = topping
        self.sauce = sauce
    
    def getDetails(self):
        print(f"base: {self.base}, topping: {self.topping}, sauce: {self.sauce}")