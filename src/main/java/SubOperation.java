
public class SubOperation {
	
	private int a;
	private int b;
	
	public void setA(double input) {
		int a = (int)input;
		this.a = a;
	}
	
	public void setB(double input) {
		int b = (int)input;
		this.b = b;
	}
	
	public int getResult() {
		return a - b;
	}
}
