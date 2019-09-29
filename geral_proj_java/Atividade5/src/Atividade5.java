import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Atividade5 {

    public static void main(String[] args) {

        ArrayList<String> ingredientes = new ArrayList<String>();

        ingredientes.add("Ovos");
        ingredientes.add("Leite");
        ingredientes.add("Açulcar");
        ingredientes.add("Chocolate");
        ingredientes.add("Farinha");
        System.out.println(Arrays.toString(ingredientes.toArray()));

        ingredientes.remove(ingredientes.size() - 1);
        System.out.println(Arrays.toString(ingredientes.toArray()));

        ingredientes.add(0,"Café");
        System.out.println(Arrays.toString(ingredientes.toArray()));

        ingredientes.set(3,"Mel");
        System.out.println(Arrays.toString(ingredientes.toArray()));
        System.out.println(ingredientes.get(2));
        Collections.sort(ingredientes);
        System.out.println(Arrays.toString(ingredientes.toArray()));
    }

}

