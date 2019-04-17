from Stoplight import Stoplight

class Intersection:
    def __init__(self, name, **kwargs):
        self.name = name
        self.adjacents = kwargs.get('adjacents')
        self.stoplights = kwargs.get('stoplights')

    def __repr__(self):
        return "{}({}, {}, {})".format(self.__class__.__name__, self.name, self.adjacents, self.stoplights) 
        #return "Routes: %s, Stoplights: %s" % (str(self.routes)[1:-1], str(self.stop_lights)[1:-1])

    def addRoute(self, aRoute):
        self.routes.append(aRoute)

    def addStoplight(self, aStoplight):
        self.stop_lights.append(aStoplight)

