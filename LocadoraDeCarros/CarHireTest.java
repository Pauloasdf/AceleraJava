package LocadoraDeCarros;

import LocadoraDeCarros.exception.InvalidCarType;
import LocadoraDeCarros.exception.InvalidDayQty;
import org.junit.Assert;
import org.junit.Test;

public class CarHireTest {

    //a quantidade de dias é válida (>1)
    @Test (expected = InvalidDayQty.class) public void ifDayQtyIsNotValidShouldReturnException(){
        //inputs
        int days = -1;

        CarHire hire = new CarHire();

        double price = hire.makeAHire(days,CarType.COMUN.getType());
    }
    //se o tipo de carro não existe (dentre os especificados)
    @Test (expected = InvalidCarType.class)  public void isCarTypeIsNotValidShouldReturnException(){
        //inputs
        int days = 1;

        CarHire hire = new CarHire();

        double price = hire.makeAHire(days,7);
    }

    //se o carro for comum e a reserva for de 3 dias deve retornar 126 como valor
    @Test public void isCarComumAndHireDays3ShouldReturn126(){
        //inputs
        int days = 3;
        double expectedPrice = 126.0;

        CarHire hire = new CarHire();

        double price = hire.makeAHire(days,CarType.COMUN.getType());

        Assert.assertEquals(expectedPrice,price,0.001);
    }
    //se o carro for caminhonete e a reserva for de 3 dias deve retornar 252 como valor
    @Test public void isCarCaminhoneteAndHireDays3ShouldReturn252(){
        //inputs
        int days = 3;
        double expectedPrice = 252.0;

        CarHire hire = new CarHire();

        double price = hire.makeAHire(days,CarType.CAMINHONETE.getType());

        Assert.assertEquals(expectedPrice,price,0.001);
    }
    //se o carro for suv e a reserva for de 3 dias deve retornar 315 como valor
    @Test public void isCarSUVAndHireDays3ShouldReturn315(){
        //inputs
        int days = 3;
        double expectedPrice = 315.0;

        CarHire hire = new CarHire();

        double price = hire.makeAHire(days,CarType.SUV.getType());

        Assert.assertEquals(expectedPrice,price,0.001);
    }
    //se o carro for moto e a reserva for de 3 dias deve retornar 94,5 como valor
    @Test public void isCarMotocicleAndHireDays3ShouldReturn94_5(){
        //inputs
        int days = 3;
        double expectedPrice = 94.5;

        CarHire hire = new CarHire();

        double price = hire.makeAHire(days,CarType.MOTO.getType());

        Assert.assertEquals(expectedPrice,price,0.001);
    }

    //se o carro for comum e a reserva for de 6 dias deve retornar 264 como valor
    @Test public void isCarComumAndHireDays6ShouldReturn264(){
        //inputs
        int days = 6;
        double expectedPrice = 264.0;

        CarHire hire = new CarHire();

        double price = hire.makeAHire(days,CarType.COMUN.getType());

        Assert.assertEquals(expectedPrice,price,0.001);
    }
    //se o carro for caminhonete e a reserva for de 6 dias deve retornar 528 como valor
    @Test public void isCarCaminhoneteAndHireDays6ShouldReturn528(){
        //inputs
        int days = 6;
        double expectedPrice = 528.0;

        CarHire hire = new CarHire();

        double price = hire.makeAHire(days,CarType.CAMINHONETE.getType());

        Assert.assertEquals(expectedPrice,price,0.001);
    }
    //se o carro for suv e a reserva for de 6 dias deve retornar 660 como valor
    @Test public void isCarSUVAndHireDays6ShouldReturn660(){
        //inputs
        int days = 6;
        double expectedPrice = 660.0;

        CarHire hire = new CarHire();

        double price = hire.makeAHire(days,CarType.SUV.getType());

        Assert.assertEquals(expectedPrice,price,0.001);
    }
    //se o carro for moto e a reserva for de 6 dias deve retornar 198 como valor
    @Test public void isCarMotocicleAndHireDays6ShouldReturn198(){
        //inputs
        int days = 6;
        double expectedPrice = 198;

        CarHire hire = new CarHire();

        double price = hire.makeAHire(days,CarType.MOTO.getType());

        Assert.assertEquals(expectedPrice,price,0.001);
    }

    //se o carro for comum e a reserva for de 11 dias deve retornar 528 como valor
    //se o carro for caminhonete e a reserva for de 11 dias deve retornar 1056 como valor
    //se o carro for suv e a reserva for de 11 dias deve retornar 1320 como valor
    //se o carro for moto e a reserva for de 11 dias deve retornar 396 como valor

}
