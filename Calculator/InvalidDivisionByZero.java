package Calculator;

public class InvalidDivisionByZero extends IllegalArgumentException {

    public InvalidDivisionByZero() {
        super("It's impossible to divide something by zero!");
    }

}
