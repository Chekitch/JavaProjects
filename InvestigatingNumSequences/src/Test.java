
public class Test {
	
	public static void main(String[] args) {
		
		LastDigitDistribution d1 = new LastDigitDistribution();
		d1.process(new SquareSequence(), 400);
		d1.display();
		
		System.out.println("\n");
		
		
		LastDigitDistribution d2 = new LastDigitDistribution();
		d2.process(new RandomSequence(), 400);
		d2.display();
		
		System.out.println("\n");
		
		LastDigitDistribution d3 = new LastDigitDistribution();
		d3.process(new CubeSequence(), 400);
		d3.display();
		
		
	}
}
