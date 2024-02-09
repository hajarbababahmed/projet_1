package projet_1;
import java.util.Scanner;


public class projet_1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Entrez le nombre a=" ); 
		Scanner sc= new Scanner(System.in);
		int a;
		
	    a = sc.nextInt(); 
	    
		int secret_nbr=22;
		
		while(a!=secret_nbr) {
			
			if(a>secret_nbr) {
				System.out.println("le némuro que vous avez saisi est sépurieur au némuro sucret" );
				System.out.println("Entrez le nombre a=" ); 
				a = sc.nextInt(); 
			}
			else if(a<secret_nbr) {
				System.out.println("le némuro que vous avez saisi est inférieur au némuro sucret" );
				System.out.println("Entrez le nombre a=" ); 
				a = sc.nextInt(); 
				
			
		}

		}
	   System.out.println("bravo vous avez gagné le jeux" );
			
		
		

	}

}