
public class CubeSequence implements Sequence {

	private int n;
	@Override
	public int next() {
		// TODO Auto-generated method stub
		n++;
		return n*n*n;
	}

}
