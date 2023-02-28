import java.util.HashMap;
import java.util.Map;


public class Translator {
    //hashmap syntax is HashMap<keyType, valueType> hashMapName = new HashMap<>();
    Map<Integer, String> numericAlpha = new HashMap<>();

    //constructor
    public Translator(){
    }
    public Translator(String[] alphabetic, Integer[] numeric){
        //Voeg in de body van de for-loop een nieuwe entry toe aan de HashMap met de correcte waardes uit `numeric` en `alphabetic`. Gebruik de `i` variabele uit je for-loop om de correcte waardes uit de arrays te halen.
        for (int i = 0; i < numeric.length; i++) {
            // Je hebt de hashmap gedeclareerd met een key: integer en een value: string, dus je moet de argumenten ook op die manier injecteren alvorens het kan werken. Dat betekent dat je eerst de integer numeric en dan pas de String alphabetic schrijft:
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }
    //Maak in de Translator class een nieuwe methode genaamd `translate(Integer number)` die een String returnt.
    public String translate(Integer number){
        return numericAlpha.get(number);
    }
}
