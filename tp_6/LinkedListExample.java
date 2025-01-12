package tp_6;

import java.util.LinkedList;

public class LinkedListExample {
	/**
	 * Développé par : Abdessamad Bencheraik
	 * IT - TAM
	 * Date de création : 27 nov. 2024
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> link = new LinkedList<String>();
		link.add("abdessamad");
		link.add("bencheraik");
		link.add("Java");
		link.add("python");
		link.add("TS");
		link.add("reseaux");
		link.addLast("softskills");
		link.addFirst("Math");
		System.out.println("Link : "+link);
		
		link.remove("Badr");
		link.remove("0");
		System.out.println("Link : "+link);
		link.removeFirst();
		link.removeLast();
		System.out.println("Link : "+link);
		
		Object val = link.get(3);
		link.set(3,(String)val+"est modifie");
		System.out.println("Link : "+link);	}
	
}
