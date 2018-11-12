package gameRoom.model.entity;

import gameRoom.model.enums.AgeGroup;
import gameRoom.model.enums.CarType;
import gameRoom.model.enums.ChildMale;


public class Car extends Toy {

    private int countOfWheels;
    private CarType carType;

    public int getCountOfWheels() {
        return countOfWheels;
    }
    public void setCountOfWheels(int countOfWheels) {
        this.countOfWheels = countOfWheels;
    }

    public CarType getCarType() {
        return carType;
    }
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public Car(long id, String name, long price, AgeGroup ageGroup, ChildMale childMale, int countOfWheels, CarType carType) {
        super(id, name, price, ageGroup, childMale);
        this.countOfWheels = countOfWheels;
        this.carType = carType;
    }
}
