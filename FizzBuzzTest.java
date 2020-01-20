import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    //Testes feature 1
    @Test
    public void testIfMultipleOf3ShouldReturnFizz(){

        //inputs
        Integer number = 3;

        //execution
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.doFizzBuzz(number);

        //validation
        Assert.assertEquals("Fizz",actual);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testIsNumberOutOfLowerRange1ShouldReturnException(){
        //inputs
        Integer lowerNumber = 0;

        //execution
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.doFizzBuzz(lowerNumber);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testIsNumberOutOfHigherRange100ShouldReturnException(){
        //inputs
        Integer higherNumber = 101;

        //execution
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.doFizzBuzz(higherNumber);
    }

    //Testes feature 2
    @Test
    public void testIfMultipleOf5ShouldReturnBuzz(){

        //inputs
        Integer number = 5;

        //execution
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.doFizzBuzz(number);

        //validation
        Assert.assertEquals("Buzz",actual);
    }
    @Test
    public void testIfNotMultipleOf5ShouldReturnNumber(){
        //inputs
        Integer number = 2;
        //execution
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.doFizzBuzz(number);
        //validation
        Assert.assertEquals("2",actual);
    }

    //Testes feature 3
    @Test
    public void testIfMultipleOf5And3ShouldReturnFizzBuzz(){
        //inputs
        Integer number = 15;
        //execution
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.doFizzBuzz(number);
        //validation
        Assert.assertEquals("FizzBuzz",actual);
    }
    @Test(expected = NullPointerException.class)
    public void testIsNumberNullShouldReturnException(){
        //inputs
        Integer higherNumber = null;

        //execution
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actual = fizzBuzz.doFizzBuzz(higherNumber);
    }
    @Test
    public void testFinalOutput(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedOutput = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19BuzzFizz2223FizzBuzz26Fizz2829FizzBuzz3" +
                "132Fizz34BuzzFizz3738FizzBuzz41Fizz4344FizzBuzz4647Fizz49BuzzFizz5253FizzBuzz56Fizz5859FizzBuzz6162Fiz" +
                "z64BuzzFizz6768FizzBuzz71Fizz7374FizzBuzz7677Fizz79BuzzFizz8283FizzBuzz86Fizz8889FizzBuzz9192Fizz94Buz" +
                "zFizz9798FizzBuzz";
        String output = fizzBuzz.showFizzBuzz();
        Assert.assertEquals(expectedOutput,output);
    }
}
