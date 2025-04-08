import threading

class Singleton:
    singleton = None
    lock = threading.Lock()


    def getInstance():
        if Singleton.singleton == None:
            Singleton.lock.acquire_lock()
            if Singleton.singleton == None:
                Singleton.singleton = Singleton()
        
        return Singleton.singleton