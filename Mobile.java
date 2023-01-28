package week1.day2;

public class Mobile {
	public void mobileSpecification() {
	String mobileBrandName=("Vivo");
	char mobileLogo='V';
	short noOfMobilePiece=195;
    int modelNumber=12345678;
	long mobileImeiNumber=122334455L;
    float mobilePrice=15000f;
	boolean isDamaged=false;
	
	System.out.println("BrandName="+mobileBrandName);
	System.out.println("logo="+mobileLogo);
    System.out.println("Number Of Mobile Piece="+noOfMobilePiece);
    System.out.println("Mobile Model Number="+modelNumber);
    System.out.println("Imei Number="+mobileImeiNumber);
    System.out.println("Rate="+mobilePrice);
    System.out.println("mobile Condition damaged ="+isDamaged);	
	}
    public static void main(String[] args) {
    	Mobile object=new Mobile();
    	object.mobileSpecification();
	}

    }
