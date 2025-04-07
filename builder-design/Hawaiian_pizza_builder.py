from pizza_builder import PizzaBuilder

class HawaiianPizzaBuilder(PizzaBuilder):
    def __init__(self):
        self.withBase("hawaiian style").withSauce("marinara").withTopping("pineapple and chicken")
    
    def build(self):
        return super().build()