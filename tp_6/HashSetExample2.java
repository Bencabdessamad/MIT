package tp_6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample2 {
    /**
     * Développé par : Abdessamad Bencheraik
     * IT - TAM
     * Date de création : 30 nov. 2024
     */
    public static void main(String[] args) {
        
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("Maroc");
        ls.add("Spain");
        ls.add("Portg");
        ls.add("France");

        
        HashSet<String> set = new HashSet<String>(ls);

        
        set.add("Palestine");

        
        Iterator<String> it = set.iterator();
        System.out.println("Contenu du HashSet :");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        
        Iterator<String> it1 = ls.iterator();
        System.out.println("\nContenu de l'ArrayList :");
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }
    }
}
