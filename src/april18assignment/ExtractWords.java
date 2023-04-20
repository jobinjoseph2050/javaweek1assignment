package april18assignment;

public class ExtractWords {
	
	String address = "100 Queen street, Toronto, M5V 3E3";
	
	String[] addresssplitted = new String[3];
	
	
	
	void extractionofwords() {
		
		System.out.println("Enter split into the streetname, city and zip");
		String[] addresssplitted = address.split(",");
		String streetname = addresssplitted[0];
		String city	=	addresssplitted[1];
		String zip	=	addresssplitted[2];
		System.out.println("streetname: " +  streetname );
		System.out.println("city: " +  city );
		System.out.println("zip: " +  zip );
		
	}
	

}
