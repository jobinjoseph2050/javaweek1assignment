package pricecalculator;

public class Discountedrate {

	double originalprice;
	boolean havepromocode;
	boolean promo5;
	boolean promo10;
	boolean promo20;
	double finalprice;
	
	void discountprice() {
		
		finalprice = originalprice*0.5;
		
		if(havepromocode)	
		 
		{ 	if(promo5)
			
				{finalprice = finalprice - .05*finalprice;
				System.out.println("Final price with 5 percent extra discount = " + finalprice );
				}
		
			else if(promo10)
				{
				finalprice = finalprice - .10*finalprice;
				System.out.println("Final price with 10 percent extra discount = " + finalprice );
				}
		
			else if(promo20)
				{
				finalprice = finalprice - .20*finalprice;
				System.out.println("Final price with 20 percent extra discount = " + finalprice );
				}
					
			else
					
				System.out.println("Invalid promo");	
						
		}
		
		else
		
			
			System.out.println("Final price with 50 percent discount = " + finalprice );	
		
	}
}
