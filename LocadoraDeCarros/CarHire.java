package LocadoraDeCarros;

import LocadoraDeCarros.exception.InvalidCarType;
import LocadoraDeCarros.exception.InvalidDayQty;
import LocadoraDeCarros.model.Caminhonete;
import LocadoraDeCarros.model.ComunCar;
import LocadoraDeCarros.model.Car;

public class CarHire {

    public double makeAHire(int days,int carType){
        double price = 0.0;
        if(days<1){
            throw new InvalidDayQty();
        }

        Car car = null;

        if(CarType.COMUN.getType() == carType){
            car = new ComunCar();
        }
        if(CarType.CAMINHONETE.getType() == carType){
            car = new Caminhonete();
        }
        if(CarType.SUV.getType() == carType){
            car = new SuvCar();
        }

        if(CarType.MOTO.getType() == carType){
            car = new Moto();
        }

        if(car == null){
            throw new InvalidCarType();
        } else {
            price = car.calculatePrice(days);
        }
        return price;
    }

}
