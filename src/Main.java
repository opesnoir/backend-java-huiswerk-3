import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // main methode staan twee arrays (1 numeriek en 1 alfabetisch), een boolean variabele, een Translator object en een Scanner object
        // arrays: 1 numeriek en 1 alfabetisch
        Integer [] numeric = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String [] alphabetic = {"een", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "nul" };

        Translator translator = new Translator(alphabetic, numeric);

        String ongeldig = "ongeldige invoer, invoer moet x of v zijn en een cijfer tussen de 0 en 9 zijn";
        Scanner scanner = new Scanner(System.in);
        boolean play = true;

        while (play){
            System.out.println("Type 'x' om te stoppen en type 'v' om te vertalen");
            String input = scanner.nextLine();

            if(input.equals("x")){
                play = false;
            } else if (input.equals("v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                //sla je het resultaat van `scanner.nextInt()` op in een variabele `int number`,
                int number = scanner.nextInt();
                //voeg nog een `scanner.nextLine();` toe op de volgende regel (scanner.nextInt doet dit namelijk niet van zichzelf
                scanner.nextLine();

                if (number < 10){
                    String result = translator.translate(number);
                    System.out.println("De vertaling van " + number + " is " + result);
                }

            } else {
                System.out.println(ongeldig);


            }



        }

    }



        //Scanner object

        /* deze regel mag je weg halen voor de bonus opdracht. Onderstaande code is voor de bonus opdracht.
        HashSet<Integer> secretnumber = randomnumbergenerator();
        String stringnumber =  setToStringConverter(secretnumber);
        System.out.println(stringnumber);
        feedback();
         deze regel mag je weg halen voor de bonus opdracht */



    /*
     Deze methode is voor de bonus opdracht.
     */
    public static void feedback(String stringnumber) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder feedback = new StringBuilder();
        System.out.println("take a guess");
        String guess = scanner.nextLine();
        if (Objects.equals(guess, stringnumber)) {
            System.out.println("gefeliciteerd je hebt het goed");
        } else {
            for (int i = 0; i < 4; i++) {
                if (guess.substring(i, i + 1).equals(stringnumber.substring(i, i + 1))) {
                    feedback.append("+");
                } else if (stringnumber.contains(guess.substring(i, i + 1))) {
                    feedback.append("0");
                } else {
                    feedback.append("X");
                }
            }
        }
        System.out.println(feedback.toString());
    }
}
