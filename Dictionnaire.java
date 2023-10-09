package liste;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionnaire {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		HashMap<String, String> dictionnaire = new HashMap<>(); 
		dictionnaire.put("programer", "progammeur");
		dictionnaire.put("hello", "bonjour");
		dictionnaire.put("girl", "fille");
		
		System.out.println("Veuillez entrez le mot en anglais : ");
		String mot = scanner.nextLine().toLowerCase();
		if(dictionnaire.containsKey(mot)) {
			
			System.out.println("La traduction francais : " + dictionnaire.get(mot));
		}
		else {
			 System.out.println("Le mot n'existe pas dans le dictionnaire");
		}
		scanner.close();
		
	}


}
