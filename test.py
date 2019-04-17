from Stoplight import Stoplight
from Intersection import Intersection

timer = {'Green': 20, 'Yellow': 7, 'Red': 50}

A = Stoplight(timer, 'Straight')
B = Stoplight(timer, 'Right')
C = Stoplight(timer, 'Left')
D = Stoplight(timer, 'Straight')

stopLightList = [A, B, C, D]
anIntersection = Intersection()

anIntersection.addStoplight(stopLightList)

print(anIntersection)
