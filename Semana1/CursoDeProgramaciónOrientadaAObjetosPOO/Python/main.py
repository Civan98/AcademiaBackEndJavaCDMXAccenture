from car import Car

if __name__ == "__main__":
    print("Hola ivan")
    car = Car()
    car.license = "EWT456"
    car.driver = "Lucy Contreras"
    print(vars(car))
 
    car2 = Car()
    car2.license = "RRT987"
    car2.driver = "Raul Castañeda"
    print(vars(car2))
