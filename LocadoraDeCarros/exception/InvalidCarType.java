package LocadoraDeCarros.exception;

public class InvalidCarType extends IllegalArgumentException {
    public InvalidCarType() {
        super("Invalid car type. Expected: 'Carro Comum', 'SUV','Caminhonete', 'Moto'");
    }
}
