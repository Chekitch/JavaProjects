
public class SeriesResonantCircuit extends ResonantCircuit {
	
	private double R;
	private double C;
	private double L;

	public SeriesResonantCircuit(double w0, double b, double k) {
		super(w0, b, k);
		// TODO Auto-generated constructor stub
		R = k;
		C = 1/(getB()*R);
		L = 1/(getW0()*getW0()*C);
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
