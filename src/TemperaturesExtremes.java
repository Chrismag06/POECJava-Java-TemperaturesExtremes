import java.util.Scanner;

public class TemperaturesExtremes {

	public static void main(String[] args) {
		/*
		 * Exercice 3 : "Les températures extrêmes" Un centre météorologique vous
		 * demande de développer un programme qui peut enregistrer les températures sur
		 * plusieurs jours dans différentes villes. Le programme doit stocker les
		 * températures dans un tableau à deux dimensions, et ensuite afficher la
		 * température la plus élevée et la plus basse enregistrée.
		 */

		Scanner myObj = new Scanner(System.in);
		String[] Villes = {"Paris","Lille","Strasbourg","Poitiers","Bretagne","Bordeaux","Lyon","Nice","Marseille"};
		int[][] Temperatures = new int[Villes.length][2];
		
	    for (int i = 0; i < Temperatures.length; ++i) {
	    	System.out.println("Entrez les temperatures pour: " + Villes[i]);
		    for (int j= 0; j < Temperatures[i].length; ++j) {
		    	if (j%2 == 0) {
		    		System.out.println(" min : ");
		    	}else {
		    		System.out.println(" max : ");
		    	}
		    	Temperatures[i][j] = myObj.nextInt();
		      } 
	     } 
	    
	    for (int i = 0; i < Temperatures.length; ++i) {
	    	System.out.println("Les temperatures à " + Villes[i] + " sont ");
		    for (int j= 0; j < Temperatures[i].length; ++j) {
		    	if (j%2 == 0) {
		    		System.out.println(" min : " + Temperatures[i][j]);
		    	}else {
		    		System.out.println(" max : " + Temperatures[i][j]);
		    	}
		      } 
	     } 

	}

}
