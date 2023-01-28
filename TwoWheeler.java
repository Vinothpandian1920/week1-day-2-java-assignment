package week1.day2;

public class TwoWheeler {
	public static void twoWheelerSpecification() {
		int noOfWheels=2;
		System.out.println("Bike Wheels :"+noOfWheels );
		
		short noOfMirror=2;
		System.out.println("Bike Mirror :"+noOfMirror);
		
		long chassisNumber=1234567L;
		System.out.println("Bike chassisNumber :"+chassisNumber);
		
		boolean isPunctured=false;
		System.out.println("tyre is punctured :"+isPunctured);
		
		String bikeName=("Royal Enfeild");
		System.out.println("My Bike Name is :"+bikeName);
		
		double runningKM=15088.78;
		System.out.println("Over all Running in KM :"+runningKM);
	    }

	    public static void main(String[] args) {
		TwoWheeler object=new TwoWheeler();
	 	twoWheelerSpecification();
	
	    }

       }

