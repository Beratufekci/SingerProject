import java.util.ArrayList;

public class Singers {
	
	private ArrayList<String> ListOfSingers = new ArrayList<String>();
	
	public void showSingers() {
		
		System.out.println("There are " + ListOfSingers.size() + " singers on the list");
		System.out.println("Singers:");
		
		for(String a:ListOfSingers)
			System.out.println(a);
		 
	}
	
	public void AddSinger(String name) {
		
		ListOfSingers.add(name);
		
		System.out.println("ListOfSingers was updated");
		
	}
	
	public void SetSinger(String newName , int position) {
		
		ListOfSingers.set(position,newName);
		
	    System.out.println("ListOfSingers was updated");
	    
	}
	
	public void deleteSinger(int position) {
		
		String name= ListOfSingers.get(position);
		ListOfSingers.remove(position);
		
		System.out.println("Singer called " + name + "was deleted from the list" );
		
	}
	
	public void searchSinger(String name) {
		
		int position = ListOfSingers.indexOf(name);
	    
		if(position >0) {
			System.out.println("Singer was found");
			System.out.println("Singer called " + name + " is "+ (position+1) + ". position on the list" );
			
		}
		else
			System.out.println("Singer was not found");
	
	}
	

	

}
