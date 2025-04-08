from singleton import Singleton
def main():
    sing = Singleton.getInstance()
    sing2 = Singleton.getInstance()

    print(sing, sing2)
    assert(sing == sing2)

main()