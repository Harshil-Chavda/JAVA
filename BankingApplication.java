import threading

class DisplayThread1(threading.Thread):
    def run(self):
        while True:
            print("Thread1")
            threading.Event().wait(1)

class DisplayThread2(threading.Thread):
    def run(self):
        while True:
            print("Thread2")
            threading.Event().wait(2)

DisplayThread1().start()
DisplayThread2().start()
