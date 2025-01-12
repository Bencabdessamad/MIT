package tp_6;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample1 {
	/**
	 * Développé par : Abdessamad Bencheraik
	 * IT - TAM
	 * Date de création : 30 nov. 2024
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashSet<String> pays = new HashSet<String>();
	pays.add("Maroc");
	pays.add("USA");
	pays.add("Japon");
	pays.add("KSA");
	pays.add("Spain");
	pays.add("Tunisie");
	
	System.out.println("Pays dans le HashSet : " + pays);
	
	if(pays.contains("Maroc")) {
		System.out.println(1);
	}else {
		System.out.println(0);
	}
	
	pays.remove("Spain");
	if(!pays.contains("Spain")) {
		System.out.println(0);
	}else {
		System.out.println(1);
	}
	
	System.out.println("Pays dans le HashSet : " + pays);
	
	System.out.println("Iterer sur pays :");
	
	Iterator<String> it = pays.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
		
	}
	}
	
}
