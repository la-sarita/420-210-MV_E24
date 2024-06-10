import javax.sound.midi.Soundbank;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final int MAX_AGE = 100;
    public static final String MSG_SOLLISITATION = "Binevenue dans notre programme!";

    public static void main(String[] args) {
        System.out.println("L'age maximum est : " + MAX_AGE);
        System.out.println(MSG_SOLLISITATION);

        int add = 5 + 3;
        int sub = 5 - 3;
        int mul = 5 * 3;
        int div = 5 / 3;
        int mod = 5 % 3;
        int val = 5;
        val++;
        System.out.println(5 / 3.0);
        System.out.println(val);
        val--;
        System.out.println(val);
        boolean isDegit = Character.isDigit('f');
        boolean isLetter = Character.isLetter('/');
        System.out.println(isDegit);
        System.out.println(isLetter);
        System.out.println(Character.isSpace(' '));
        System.out.println(Character.isWhitespace('.'));
        System.out.println(Character.toChars(65));
        System.out.println(Character.toString('5') + 4);
        System.out.println(Character.valueOf('5') + 4);
        System.out.println(Character.getNumericValue('5') + 4);
        System.out.println(Character.SPACE_SEPARATOR);

        System.out.println(Math.abs(-5));
        System.out.println(Math.max(12, 18));
        System.out.println(Math.max(1.7f, 1.8f));
        System.out.println(Math.max(1220.52, 18005.89));
        System.out.println(Math.max(12000L, 180000000L));
//        System.out.println(Integer.valueOf(nombre) * 2);
//        System.out.println(Character.getNumericValue(nombre.charAt(0)) * 2);
//        System.out.println(age * 2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int nombre1 = sc.nextInt();
        System.out.println("Entrez un autre nombre : ");
        int nombre2 = sc.nextInt();
        System.out.println(Math.max(nombre1, nombre2));
        System.out.println(Math.min(nombre1, nombre2));
        System.out.println(Math.sqrt(nombre2));
        System.out.println(Math.pow(nombre2, nombre1));
        System.out.println(Math.floor(152.4));
        System.out.println(Math.ceil(152.4));
        System.out.println(Math.round(152.4));
        System.out.println((Math.random() * 100));
        sc.close();

        // La classe String
        System.out.println("Bonjour!\nNom du cours :\t\tPOO\nNon enseignante :\t\"Sara\"\n" +
                "La note de passage est de : 60 \\ 100");

        String s1 = "Bonjour";
        String s2 = "Bonjour";
        String s3 = new String("Bonjour");
        System.out.println("s1 == s2 -> " + (s1 == s2));
        System.out.println("s1 == s3 -> " + (s1 == s3));
        System.out.println("s2 == s3 -> " + (s2 == s3));
        System.out.println("s1.equals(s2) -> " + s1.equals(s2));
        System.out.println("s1.equals(s3) -> " + s1.equals(s3));
        System.out.println("s1.length() : " + s1.length());
        System.out.println(s1.charAt(2));
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(1, 4));
        System.out.println(s1.equals("bonjour"));
        System.out.println(s1.equalsIgnoreCase("bonjour"));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo("bonjour"));
        System.out.println(s1.compareToIgnoreCase("bonjour"));
        System.out.println((int)('B' - 'b'));
        System.out.println(s1.indexOf('j'));
        System.out.println(s1.indexOf("jour"));
        System.out.println(s1.indexOf('o', 3));
        System.out.println(s1.indexOf("on", 3));
        System.out.println(s1.lastIndexOf('o'));
        System.out.println(s1.lastIndexOf("ou"));
        System.out.println(s1.contains("jour"));
        System.out.println(s1.contains('n' + ""));
        System.out.println(s2.replace('o', 'a'));
        System.out.println(s1.replace("jour", "soir"));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println("    Bonjour  hggg     ".trim());
        System.out.println(s1.isBlank());
        System.out.println(s1.isEmpty());
        System.out.println("".isEmpty());
        System.out.println("".isBlank());
        System.out.println("    ".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println(String.join(",", "Bonjour", "le", "monde"));
        System.out.println();
    }
}