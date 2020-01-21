package Calculator;

public class Calculator {

    private void isAnyOfNumbersNull(Double number1,Double number2){
        if(number1 == null || number2 == null) throw new CalculatorNullNumberException();
    }
    public Double sum(Double number1, Double number2) {
        this.isAnyOfNumbersNull(number1,number2);
        return Double.sum(number1,number2);
    }
    public Double subtract(Double number1, Double number2){
        this.isAnyOfNumbersNull(number1,number2);
        return (number1 - number2);
    }
    public Double multiply(Double number1, Double number2){
        this.isAnyOfNumbersNull(number1,number2);
        return (number1 * number2);
    }
    public Double divide(Double number1, Double number2){
        this.isAnyOfNumbersNull(number1,number2);
        if(number2 == 0){throw new InvalidDivisionByZero();}
        return (number1 / number2);
    }
}
