from pizza import Pizza

class PizzaBuilder():
    def __init__(self):
        self.base = "new-york style"
        self.topping = "four cheese"
        self.sauce = "marinara"
    
    def withBase(self, base):
        self.base = base
        return self
    
    def withTopping(self, topping):
        self.topping = topping
        return self
    
    def withSauce(self, sauce):
        self.sauce = sauce
        return self

    def build(self):
        return Pizza(self.base, self.topping, self.sauce)
    