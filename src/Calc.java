public class Calc {


    public static int calc(int numeFirst, int numeSecond, String operator) throws MyException {

        int input;

        switch (operator) {
            case "+":
                result:
                input = numeFirst + numeSecond;
                return input;
            case "-":
                result:
                input = numeFirst - numeSecond;
                return input;
            case "/":
                result:
                input = numeFirst / numeSecond;
                return input;
            case "*":
                result:
                input = numeFirst * numeSecond;
                return input;
        }
            throw new MyException("Вы ввели не правильное число");

        }
    }
