package ru.skypro;


public class Main {
    public static void main(String[] args) {
        Technique car = new Car("car1",4);
        Technique car2 = new Car("car2",4);

        Technique truck = new Truck("truck1",4);
        Technique truck2 = new Truck("truck1",4);

        Bicycle bicycle = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2",2);

        ServiceStation station = new ServiceStation();
        station.check(car);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}
