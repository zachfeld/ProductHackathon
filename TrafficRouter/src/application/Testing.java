package application;


public class Testing {

	public static void main (String args[]){
		Stoplight S1 = new Stoplight("1001", new int[]{50,40,20} , "Straight");
		Stoplight S2 = new Stoplight("1002", new int[]{50,40,20} , "Straight");
		Stoplight S3 = new Stoplight("1003", new int[]{50,40,20} , "Straight");
		Stoplight S4 = new Stoplight("1004", new int[]{50,40,20} , "Straight");
		
		Intersection I1 = new Intersection("Forest-Beaver", new Stoplight[]{S1, S2, S3, S4});
		Intersection I2 = new Intersection("Main-School", new Stoplight[]{S1, S2, S3, S4});
		Intersection I3 = new Intersection("Forest-Lexington", new Stoplight[]{S1, S2, S3, S4});
		Intersection I4 = new Intersection("Lexington-I95", new Stoplight[]{S1, S2, S3, S4});
		
		I1.setAdjacents(new Intersection[]{I2, I3, I4});
		I2.setAdjacents(new Intersection[]{I1, I3, I4});
		I3.setAdjacents(new Intersection[]{I1, I2, I4});
		I4.setAdjacents(new Intersection[]{I1, I2, I3});

		Route R1 = new Route(I1, I2, 3.7, 7.0);
		Route R2 = new Route(I2, I1, 3.7, 7.0);
		Route R3 = new Route(I1, I3, 5.5, 10.2);
		Route R4 = new Route(I3, I1, 5.5, 10.2);
		Route R5 = new Route(I1, I4, 1.1, 2.20);
		Route R6 = new Route(I4, I1, 1.1, 2.20);
		
		
		System.out.println(R1);
	}
}
