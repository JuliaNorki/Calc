public class Check {

   public static final String[] Rim = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX","X"};
   public static final String[] Arab = {"1","2","3","4","5","6","7","8","9","10"};


   public static boolean rim(String nume) {
      for (int i = 0; i < Rim.length; i++) {
         if (Rim[i].equals(nume))
            return true;
      }
      return false;
   }
      public static boolean arab(String nume) {
         for (int i = 0; i < Arab.length; i++) {
            if (Arab[i].equals(nume))
               return true;
         }
         return false;
      }
      public static boolean operation(String nume) {
      if (nume.equals("+") || nume.equals("-") || nume.equals("/") || nume.equals("*"))
         return true;
      return false;

         }


   }








