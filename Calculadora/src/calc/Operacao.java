package calc;

public class Operacao {
	
	private int a, b;
	
	public Operacao(int a, int b){
		this.a = a;
		this.b = b;
	}

	public int soma(){
		return a + b;
	}
	public int multiplica(){
		return a * b;
	}
	public double divide(){
		double dA = Double.parseDouble(String.valueOf(a));
		double dB = Double.parseDouble(String.valueOf(b));
		return dA / dB;
	}
	public int subtrai(){
		return a - b;
	}
	
}
