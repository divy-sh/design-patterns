from pizza_builder import PizzaBuilder
from Hawaiian_pizza_builder import HawaiianPizzaBuilder
def main():
    pizza = PizzaBuilder().withBase("new york style").withSauce("pommodoro").withTopping("chicken and pineapple").build()
    pizza.getDetails()
    pizza2 = HawaiianPizzaBuilder().build()
    pizza2.getDetails()

main()