package StreamAPI;
import java.util.Collection;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

public class CarCity {
    ArrayList<Car> cars = new ArrayList<>();

    public CarCity(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public Car firstGreatVolumeCar() {
        return cars.stream().filter(elem -> elem.engineVolume > 3).findFirst().get();
    }

    public ArrayList<Car> search(String name) {
        return new ArrayList<Car>(cars.stream().filter(elem -> elem.name.equals(name)).collect(Collectors.toList()));
    }

    public ArrayList<Car> filterCars( int fromSpeed, int toSpeed, double fromVolume, double toVolume) {
      return new ArrayList<Car>(cars.stream().filter(elem->elem.getMaxSpeed()>=fromSpeed&&elem.getMaxSpeed()<=toSpeed &&
              elem.getEngineVolume()>=fromVolume&&elem.getEngineVolume()<=toVolume).collect(Collectors.toList()));
    }
}

// public Car firstGreatVolumeCar(){


//array.stream().filter(elem->elem>0).forEach(elem-> System.out.print(elem+" }

