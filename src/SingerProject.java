import java.util.Scanner;

public class SingerProject {
	
	private static  Singers singers = new Singers();
	public static Scanner sc = new Scanner(System.in);
	
	public static void showOperations() {
		System.out.println("\t 0-Show the Operations");
		System.out.println("\t 1-Show the Singers");
		System.out.println("\t 2-Add new Singer");
		System.out.println("\t 3-Update the Singer");
		System.out.println("\t 4-Delete the Singer");
		System.out.println("\t 5-Search the Singer");
		System.out.println("\t 6-Exit...");
	}
	

	public static void main(String[] args) {
		
		System.out.println("\t Welcome to the singer app...");
		
		showOperations();
		
		boolean exit = false;
		int operation;
		
		while(!exit) {
			
			 System.out.println("Choose an operation:");
			 operation=sc.nextInt();
			 sc.nextLine();
			 
			 switch(operation) {
			    case 0:
				   showOperations();
				   break;
				   
			    case 1:
			    	showSingers();
			    	break;
			    	
			    case 2:
			    	addSinger();
			    	break;
			    	
			    case 3:
			    	UpdateSinger();
			    	break;
			    	
			    case 4:
			    	delete();
			    	break;
			    	
			    case 5:
			    	search();
			    	 break;
			    	 
			    case 6:
			    	exit = true;
			    	System.out.println("Exiting from the app...");
			    	break;
			    	 
			 }
			 
			 
		}

	}
	
	
	public static void showSingers() {
		
		singers.showSingers();
	}
	
	
	public static void addSinger() {
		
		System.out.println("Enter the name who you want to add:");
		String name = sc.nextLine();
		singers.AddSinger(name);
	}
	
	
	public static void UpdateSinger() {
		
		System.out.println("Enter the position which you want to update:");
		int position = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the new name:");
		String newName = sc.nextLine();
		
		singers.SetSinger(newName, position-1);
		
		
	}
	
	public static void delete() {
		
		System.out.println("Enter the position which you want to delete:");
		int position=sc.nextInt();
		
		singers.deleteSinger(position-1);
	}
	
	
	public static void search() {
		
		System.out.println("Singer who you want to search:");
		String name=sc.nextLine();
		
		singers.searchSinger(name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
