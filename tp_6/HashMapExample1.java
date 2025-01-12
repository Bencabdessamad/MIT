package tp_6;

import java.util.HashMap;

public class HashMapExample1{
	/**
	 * Développé par : Abdessamad Bencheraik
	 * IT - TAM
	 * Date de création : 30 nov. 2024
	 */
	public static void main(String args[]) {
		HashMap<Integer, Employe> emp = new HashMap<Integer, Employe>();
		emp.put(1, new Employe(1, "Abdessamad", "Bencheraik"));
		emp.put(2, new Employe(2, "Salah", "Bencheraik"));
		System.out.println("la taille de Haskmap est : " + emp.size());
		
		if(emp.containsKey(2)) {
			Employe ep = emp.get(2);
			System.out.println("lemploye num 2 est : " + ep);
		}
		
		System.out.println("Les employes sont : " + emp.values());
		
		emp.clear();
		if(emp.isEmpty()) {
			System.out.println("Clear");
		}
		
		System.out.println("Les employes sont : " + emp.values());

	}
}
	

