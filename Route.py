from Intersection impotr Intersection

class Route:

    def __init__(self, startIntersection, endIntersection, distance):
        this.startIntersection = startIntersection
        this.endIntersection = endIntersection
        this.distance = distance
        this.optimalSpeed = optimalSpeed
        this.traffic = 0

    def get_current_speed(self):
        return this.optimalSpeed * (1 - this.traffic)


    
