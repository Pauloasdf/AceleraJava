package Calculator;

import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;

public class CalculatorTest {
    //Testes soma
    @Test public void sum2PositiveNumberShouldReturnPositiveNumber(){
        Double number1 = 2.5;
        Double number2 = 2.5;

        Calculator calculator = new Calculator();
        Double result = calculator.sum(number1,number2);

        Assert.assertEquals((Double)(5.0),result);
    }
    @Test public void sum2NegativeNumbersShouldReturnNegativeNumber(){
        //inputs
        Double number1 = -5.0;
        Double number2 = -3.3;

        Calculator calculator = new Calculator();
        Double result = calculator.sum(number1,number2);

        Assert.assertEquals((Double)(-8.3),result);
    }
    @Test public void sumNegativeNumberWithPositiveNumberShouldReturnANumber(){
        //inputs
        Double number1 = -5.0;
        Double number2 = 3.5;

        Calculator calculator = new Calculator();
        Double result = calculator.sum(number1,number2);

        Assert.assertEquals((Double)(-1.50),result);
    }
    @Test public void sumOpositeSignalsNumbersShouldReturnZero(){
        //inputs
        Double number1 = 5.0;
        Double number2 = -5.0;

        Calculator calculator = new Calculator();
        Double result = calculator.sum(number1,number2);

        Assert.assertEquals((Double)(0.0),result);
    }
    @Test (expected = CalculatorNullNumberException.class) public void sumANullNumberShouldReturnException(){
        //inputs
        Double number1 = null;
        Double number2 = -5.0;

        Calculator calculator = new Calculator();
        Double result = calculator.sum(number1,number2);
    }

    //Teste subtração
    @Test public void subtractAPositiveNumberWithANegativeNumberShouldReturnPositiveNumber(){
        Double number1 = 2.5;
        Double number2 = -2.5;

        Calculator calculator = new Calculator();
        Double result = calculator.subtract(number1,number2);

        Assert.assertEquals((Double)(5.0),result);
    }
    @Test public void subtract2EqualNegativeNumbersShouldReturnZero(){
        Double number1 = -2.5;
        Double number2 = -2.5;

        Calculator calculator = new Calculator();
        Double result = calculator.subtract(number1,number2);

        Assert.assertEquals((Double)(0.0),result);
    }
    @Test public void subtractANumberByAHigherOpositeSignalNumberShouldReturnNegativeNumber(){
        Double number1 = 2.5;
        Double number2 = 5.0;

        Calculator calculator = new Calculator();
        Double result = calculator.subtract(number1,number2);

        Assert.assertEquals((Double)(-2.5),result);
    }
    @Test (expected = CalculatorNullNumberException.class) public void subtractANullNumberShouldReturnException(){
        //inputs
        Double number1 = null;
        Double number2 = -5.0;

        Calculator calculator = new Calculator();
        Double result = calculator.subtract(number1,number2);
    }

    //Testes Multiplicação
    @Test public void multiplyTwoPositiveNumbersShouldReturnPositiveNumber(){
        Double number1 = 2.0;
        Double number2 = 3.5;

        Calculator calculator = new Calculator();
        Double result = calculator.multiply(number1,number2);

        Assert.assertEquals((Double)(7.0),result);
    }
    @Test public void multiplyTwoNegativeNumbersShouldReturnPositiveNumber(){
        Double number1 = -2.0;
        Double number2 = -3.5;

        Calculator calculator = new Calculator();
        Double result = calculator.multiply(number1,number2);

        Assert.assertEquals((Double)(7.0),result);
    }
    @Test public void multiplyPositiveNumberWithNegativeNumberShouldReturnNegativeNumber(){
        Double number1 = 2.0;
        Double number2 = -3.5;

        Calculator calculator = new Calculator();
        Double result = calculator.multiply(number1,number2);

        Assert.assertEquals((Double)(-7.0),result);
    }
    @Test (expected = CalculatorNullNumberException.class) public void multiplyANullNumberShouldReturnException(){
        //inputs
        Double number1 = null;
        Double number2 = -5.0;

        Calculator calculator = new Calculator();
        Double result = calculator.multiply(number1,number2);
    }

    //Testes Divisão
    @Test public void divideTheSameNumbersShouldReturnOne(){
        //inputs
        Double number1 = 5.0;
        Double number2 = 5.0;

        Calculator calculator = new Calculator();
        Double result = calculator.divide(number1,number2);

        Assert.assertEquals((Double)(1.0),result);
    }
    @Test public void divideTwoNegativeNumbersShouldReturnPositiveNumber(){
        //inputs
        Double number1 = -5.0;
        Double number2 = -2.0;

        Calculator calculator = new Calculator();
        Double result = calculator.divide(number1,number2);

        Assert.assertEquals((Double)(2.5),result);
    }
    @Test public void divideAPositiveNumberByANegativeOneShouldReturnANegativeNumber(){
        //inputs
        Double number1 = -5.0;
        Double number2 = 2.0;

        Calculator calculator = new Calculator();
        Double result = calculator.divide(number1,number2);

        Assert.assertEquals((Double)(-2.5),result);
    }
    @Test public void everyNumberDividedByZeroShouldReturnZero(){
        //inputs
        Double number1 = 0.0;
        Double number2 = 5.0;

        Calculator calculator = new Calculator();
        Double result = calculator.divide(number1,number2);

        Assert.assertEquals((Double)(0.0),result);
    }
    @Test (expected = CalculatorNullNumberException.class) public void divideANullNumberShouldReturnException(){
        //inputs
        Double number1 = null;
        Double number2 = -5.0;

        Calculator calculator = new Calculator();
        Double result = calculator.divide(number1,number2);
    }
    @Test (expected = InvalidDivisionByZero.class) public void divideANumberByZeroShouldReturnException(){
        //inputs
        Double number1 = 5.5;
        Double number2 = 0.0;

        Calculator calculator = new Calculator();
        Double result = calculator.divide(number1,number2);
    }

}
