package tp_6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample {
	/**
	 * Développé par : Abdessamad Bencheraik
	 * IT - TAM
	 * Date de création : 27 nov. 2024
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(2024);
		list.add(2025);
		list.add(2026);
		list.add(0,2020);
		System.out.println(list);
		list.remove(1);
		System.out.println(list);
		list.set(1, 2024);
		System.out.println(list);
		System.out.println("List[1] : "+list.get(1));
		System.out.println("la taille : "+list.size());
		System.out.println("Liste non triée : "+list);
		Collections.sort(list);
		System.out.println("Liste triée : "+list);
		
	}
	
}
