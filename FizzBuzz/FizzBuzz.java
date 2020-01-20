public class FizzBuzz {
    public String doFizzBuzz(Integer number){

        if(number<1 || number>100){
            throw new IllegalArgumentException();
        }
        if((number % 3 == 0) && (number % 5 == 0)){
            return "FizzBuzz";
        }
        if(number % 3 == 0){
            return "Fizz";
        }
        if(number % 5 == 0){
            return "Buzz";
        }
            return String.valueOf(number);
    }

    public String showFizzBuzz(){
        String output = "";
        for (int i = 1; i<101; i++){
            output += this.doFizzBuzz(i);
        }
        return output;
    }

}
