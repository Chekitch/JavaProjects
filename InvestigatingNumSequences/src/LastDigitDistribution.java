
public class LastDigitDistribution {
	
	int[] counter = new int[10];
	
	public void process(Sequence seq, int ValuesToProcess) {
		for(int i=1;i<=ValuesToProcess;i++) {
			int value = seq.next();
			int lastDigit = value % 10;
			counter[lastDigit]++;
		}
	}
	
	public void display() {
		for(int i=0;i<10;i++) {
			if((i+1) % 5 == 0) {
				System.out.println(i + ": " + counter[i]);
			}else {
				System.out.print(i + ": " + counter[i] + "  ");
			}
		}
	}

}
