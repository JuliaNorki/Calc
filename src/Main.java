import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {


        System.out.println("Введите строку");

        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] array = num.split(" ");
        String numeFirst = array[0];
        String numeSecond = array[2];
        String operator = array[1]; // знак вычитания умножения деления плюс.

        while (true) {
            try {

                if (Check.rim(numeFirst) && Check.rim(numeSecond) && Check.operation(operator)) {
                    int arabicResult;
                    String romanResult;
                    arabicResult = Calc.calc(Convert.romanToArabic(numeFirst), Convert.romanToArabic(numeSecond), operator);
                    romanResult = Convert.arabicToRoman(arabicResult);
                    System.out.println(romanResult);
                } else if (Check.arab(numeFirst) && Check.arab(numeSecond) && Check.operation(operator)) {
                    int arabicResult, returnFirst, returnSecond;
                    returnFirst = Integer.parseInt(numeFirst);
                    returnSecond = Integer.parseInt(numeSecond);
                    arabicResult = Calc.calc(returnFirst, returnSecond, operator);
                    System.out.println(arabicResult);

                } else throw new MyException("Вы допустили ошибку,попробуйте еще раз!");
            } catch (MyException e) {


                System.out.println(e.getMessage());
                System.out.println("Ошибка ввода. Введите выражение типа (1 + 2) or ( I * II)");
            } catch (ArrayIndexOutOfBoundsException exception) {


                System.out.println("Пожалуйста, введите выражение типа (1 + 2) or ( I * II)!");
            }

        }

    }
}