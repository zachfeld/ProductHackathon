import time

class Stoplight:

    
    def __init__(self,id, aTimer, direction):
        self.id = id 
        self.status = 'Green'
        self.timer = aTimer
        self.direction = 'Straight'


    def __repr__(self):
        return "{}({},'{}',{},'{}')".format(self.__class__.__name__, self.id, self.status, self.timer, self.direction)
   
    def setStatus(self, aStatus):
        self.status = aStatus


    def setTimer(self, aTimer):
        self.timer = aTimer

  
    def runLight(self):
        for k,v in self.timer.items():
            for _ in range(v):
                print(k)
                time.sleep(1)

timer = {'Green': 10, 'Yellow': 2, 'Red': 30}
A = Stoplight('0011', timer, 'Straight')
print(A)

#A.runLight()
