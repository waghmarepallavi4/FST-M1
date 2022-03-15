from pyexpat import model


class car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make =make
        self.transmission = transmission
        self.color =color
    def acclerate(self):
        print(self.manufacturer + " " + self.model + " has started moving")
    
    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped moving")
 
car1 = car("Toyota", "Corolla", "2015", "Manual", "White")
car2 = car("Maruti", "800", "2013", "Manual", "Red")
car3 = car("Suzuki", "Swift", "2017", "Automatic", "Black")
 
car1.acclerate()
car1.stop()

car2.acclerate()
car2.stop()