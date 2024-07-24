
public class ResonantCircuit {
	
	private double w0;
	private double b;
	private double k;
	
	public ResonantCircuit(double w0, double b, double k) {
		this.w0 = w0;
		this.b = b;
		this.k = k;
	}
	
	public double getW0() {
		return w0;
	}



	public void setW0(double w0) {
		this.w0 = w0;
	}



	public double getB() {
		return b;
	}



	public void setB(double b) {
		this.b = b;
	}



	public double getK() {
		return k;
	}



	public void setK(double k) {
		this.k = k;
	}



	public void display() {
		System.out.println("Resonant Frequency(W0) : " + w0);
		System.out.println("Bandwith(b) : " + b);
		System.out.println("Gain At Resonant Frequency(k) : " + k);
	}
	
}
