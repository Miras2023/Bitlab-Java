package StreamAPI;

public class Car {
     String name;
 int maxSpeed;
double engineVolume;
public Car(){

}

    public Car(String name, int maxSpeed, double engineVolume) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.engineVolume = engineVolume;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
}
