package pricecalculator;

public class Discountedratemain {

	public static void main(String[] args) {
		
		Discountedrate shoesale = new Discountedrate();
		shoesale.originalprice=100;
		shoesale.havepromocode=false;
		shoesale.promo5=false;
		shoesale.promo10=false;
		shoesale.promo20=false;
		shoesale.discountprice();
		
	}
}
