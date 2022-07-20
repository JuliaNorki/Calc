import com.sun.source.tree.IfTree;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {


        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] array = new String[3];

        array = num.split(" ");
        if (array.length != 3) {
            throw new MyException("Введите строку правильно");
        }
        String num1 = array[0];
        String num2 = array[2];
        String operator = array[1]; // знак вычитания умножения деления плюс.


        try {

            if (Check.rim(num1) && Check.rim(num2) && Check.operation(operator)) {
                int arabicResult;
                String romanResult;
                arabicResult = Calc.calc(Convert.romanToArabic(num1), Convert.romanToArabic(num2), operator);
                romanResult = Convert.arabicToRoman(arabicResult);
                System.out.println(romanResult);
            } else if (Check.arab(num1) && Check.arab(num2) && Check.operation(operator)) {
                int arabicResult, returnFirst, returnSecond;
                returnFirst = Integer.parseInt(num1);
                returnSecond = Integer.parseInt(num2);
                arabicResult = Calc.calc(returnFirst, returnSecond, operator);

                if (arabicResult <0) {
                    throw new MyException("Отрицательный ответ");
                }

                System.out.println(arabicResult);

            } else throw new MyException("Вы допустили ошибку,попробуйте еще раз!");
        } catch (MyException e) {

            System.out.println(e.getMessage());

        }
    }

}
