public class Convert {


        public static int romanToArabic(String sume) throws MyException {
            if (sume.equals("I")) return 1;
            else if (sume.equals("II")) return 2;
            else if (sume.equals("III")) return 3;
            else if (sume.equals("IV")) return 4;
            else if (sume.equals("V")) return 5;
            else if (sume.equals("VI")) return 6;
            else if (sume.equals("VII")) return 7;
            else if (sume.equals("VIII")) return 8;
            else if (sume.equals("IX")) return 9;
            else if (sume.equals("X")) return 10;
            else throw new MyException("Неверный формат данных");
        }

        public static String arabicToRoman(int nume) throws MyException {
            if (nume == 1) return "I";
            else if (nume == 2) return "II";
            else if (nume == 3) return "III";
            else if (nume == 4) return "IV";
            else if (nume == 5) return "V";
            else if (nume == 6) return "VI";
            else if (nume == 7) return "VII";
            else if (nume == 8) return "VIII";
            else if (nume == 9) return "IX";
            else if (nume == 10) return "X";
            else if (nume == 11) return "XI";
            else if (nume == 12) return "XII";
            else if (nume == 13) return "XIII";
            else if (nume == 14) return "XIV";
            else if (nume == 15) return "XV";
            else if (nume == 16) return "XVI";
            else if (nume == 17) return "XVII";
            else if (nume == 18) return "XVIII";
            else if (nume == 19) return "XIX";
            else if (nume == 20) return "XX";
            else if (nume == 21) return "XXI";
            else if (nume == 22) return "XXII";
            else if (nume == 23) return "XXIII";
            else if (nume == 24) return "XXIV";
            else if (nume == 25) return "XXV";
            else if (nume == 26) return "XXVI";
            else if (nume == 27) return "XXVII";
            else if (nume == 28) return "XXVIII";
            else if (nume == 29) return "XXIX";
            else if (nume == 30) return "XXX";
            else if (nume == 31) return "XXXI";
            else if (nume == 32) return "XXXII";
            else if (nume == 33) return "XXXIII";
            else if (nume == 34) return "XXXIV";
            else if (nume == 35) return "XXXV";
            else if (nume == 36) return "XXXVI";
            else if (nume == 37) return "XXXVII";
            else if (nume == 38) return "XXXVIII";
            else if (nume == 39) return "XXXIX";
            else if (nume == 40) return "XL";
            else if (nume == 41) return "XLI";
            else if (nume == 42) return "XLII";
            else if (nume == 43) return "XLIII";
            else if (nume == 44) return "XLIV";
            else if (nume == 45) return "XLV";
            else if (nume == 46) return "XLVI";
            else if (nume == 47) return "XLVII";
            else if (nume == 48) return "XLVIII";
            else if (nume == 49) return "XLIX";
            else if (nume == 50) return "L";
            else if (nume == 51) return "LI";
            else if (nume == 52) return "LII";
            else if (nume == 53) return "LIII";
            else if (nume == 54) return "LIV";
            else if (nume == 55) return "LV";
            else if (nume == 56) return "LVI";
            else if (nume == 57) return "LVII";
            else if (nume == 58) return "LVIII";
            else if (nume == 59) return "LIX";
            else if (nume == 60) return "LX";
            else if (nume == 61) return "LXI";
            else if (nume == 62) return "LXII";
            else if (nume == 63) return "LXIII";
            else if (nume == 64) return "LXIV";
            else if (nume == 65) return "LXV";
            else if (nume == 66) return "LXVI";
            else if (nume == 67) return "LXVII";
            else if (nume == 68) return "LXVIII";
            else if (nume == 69) return "LXIX";
            else if (nume == 70) return "LXX";
            else if (nume == 71) return "LXXI";
            else if (nume == 72) return "LXXII";
            else if (nume == 73) return "LXXIII";
            else if (nume == 74) return "LXXIV";
            else if (nume == 75) return "LXXV";
            else if (nume == 76) return "LXXVI";
            else if (nume == 77) return "LXXVII";
            else if (nume == 78) return "LXXVIII";
            else if (nume == 79) return "LXXIX";
            else if (nume == 80) return "LXXX";
            else if (nume == 81) return "LXXXI";
            else if (nume == 82) return "LXXXII";
            else if (nume == 83) return "LXXXIII";
            else if (nume == 84) return "LXXXIV";
            else if (nume == 85) return "LXXXV";
            else if (nume == 86) return "LXXXVI";
            else if (nume == 87) return "LXXXVII";
            else if (nume == 88) return "LXXXVIII";
            else if (nume == 89) return "LXXXIX";
            else if (nume == 90) return "XC";
            else if (nume == 91) return "XCI";
            else if (nume == 92) return "XCII";
            else if (nume == 93) return "XCIII";
            else if (nume == 94) return "XCIV";
            else if (nume == 95) return "XCV";
            else if (nume == 96) return "XCVI";
            else if (nume == 97) return "XCVII";
            else if (nume == 98) return "XCVIII";
            else if (nume == 99) return "XCIX";
            else if (nume == 100) return "C";
            else throw new MyException("");
        }

    }



