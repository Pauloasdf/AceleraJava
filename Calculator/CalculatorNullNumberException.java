package Calculator;

public class CalculatorNullNumberException extends IllegalArgumentException {

        public CalculatorNullNumberException() {
            super("Expected number,but  received a null;");
        }

}
