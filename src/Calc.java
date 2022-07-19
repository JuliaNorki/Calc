public class Calc {


    public static int calc(int num1, int num2, String operator) throws MyException {

        int input;

        switch (operator) {
            case "+":
                result:
                input = num1 + num2;
                return input;
            case "-":
                result:
                input = num1 - num2;
                return input;
            case "/":
                result:
                input = num1 / num2;
                return input;
            case "*":
                result:
                input = num1 * num2;
                return input;
        }
            throw new MyException("Вы ввели не правильное число");

        }
    }
