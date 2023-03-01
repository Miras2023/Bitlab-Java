package Stik;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class CarCity {
    ArrayList<Car> cars = new ArrayList<>();
    public CarCity(ArrayList<Car>cars){
        this.cars=cars;
    }
    public void addCar(Car car){
        cars.add(car);
    }
  public Car firstGreatVolumeCar(){
        return cars.stream().filter(y->y.engineVolume>3).findFirst().get();
  }
   public ArrayList<Car> search(String name){
        return  new ArrayList<Car> (cars.stream().filter(y->y.name.equals(name)).collect(Collectors.toList()));
   }

}
