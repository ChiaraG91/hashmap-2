import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args){

        Map<String,String> giorni = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("LU","lunedì"),
                new AbstractMap.SimpleEntry<>("MA","martedì"),
                new AbstractMap.SimpleEntry<>("ME","mercoledì"),
                new AbstractMap.SimpleEntry<>("GIO","giovedì"),
                new AbstractMap.SimpleEntry<>("VE","venerdì"),
                new AbstractMap.SimpleEntry<>("SA","sabato"),
                new AbstractMap.SimpleEntry<>("DO","domenica")
        );

        System.out.println("La mappa giorni contiene:" + giorni);

        Set<String> chiavi = giorni.keySet();
        System.out.println("Chiavi:" + chiavi);

        Collection<String> valori = giorni.values();
        System.out.println("Valori:" + valori);
    }
}
