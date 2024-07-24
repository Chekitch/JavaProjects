
public class ParallelResonantCircuit extends ResonantCircuit{

	private double R;
	private double C;
	private double L;
	
	public ParallelResonantCircuit(double w0, double b, double k) {
		super(w0, b, k);
		// TODO Auto-generated constructor stub
		R = 1/getK();
		L = R/getB();
		C = 1/(getW0()*getW0()*L);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Resistance(R) : " + R);
		System.out.println("Capacitance(C) : " + C);
		System.out.println("Inductance(L) : " + L);
		System.out.println("\n");
	}
	
	
	

}
