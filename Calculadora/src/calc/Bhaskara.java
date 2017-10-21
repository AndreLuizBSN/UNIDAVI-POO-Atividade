package calc;

public class Bhaskara extends Delta{

	public double ret1(){
		return (- super.b - Math.sqrt(super.calcular())) / 2 * super.a;
	}
	public double ret2(){
		return (- super.b + Math.sqrt(super.calcular())) / 2 * super.a;
	}
}
