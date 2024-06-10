//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
         to see how IntelliJ IDEA suggests fixing it.
        */
        //System.out.printf("Hello and welcome!");

/*        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);

        }*/

        Rencontre1.exercices();
        System.out.println(Byte.MIN_VALUE + "\t" + Byte.MAX_VALUE);
        System.out.println(Long.MIN_VALUE + "\t" + Long.MAX_VALUE);

        byte unByte = 5;
        short unShort = 2024;
        int unInt = 1234567890;
        long unLong = 12345678900000L;
        long unAutreLong = 1236545;

        float unFloat = 1234567890.0f;
        double unDouble = 465465411216516545.0;
        char unChar = 'A';
        boolean unBoolean = true;
        byte chiffreParse = Byte.parseByte("5");
        boolean chiffreParseBoolean = Boolean.parseBoolean("true");
        int unAutreInt = unChar + 3;
        int unAutreInt2 = (int)unAutreLong;
        System.out.println((char)unAutreInt);
        System.out.println(unAutreInt2);
        System.out.println(Character.toLowerCase(unChar));
        System.out.println(Character.toUpperCase('f'));
        System.out.println(Byte.valueOf("5"));
        System.out.println(1 + String.valueOf(13));
        System.out.println(1 + 13);
        String uneChaine = unChar + ""; // "A"
        System.out.println(uneChaine.toLowerCase());
    }
}