package calc;


public class Calculadora {
	
	public static void calcularOperacao(Calcular c, int a, int b){
		System.out.println("Pol: "+c.exec(a, b));
	}

	public static void main(String[] args) {
		calcularOperacao(new CalcularSomar(), 1, 2);
		calcularOperacao(new CalcularSubtrair(), 3, 2);
		calcularOperacao(new CalcularDividir(), 5, 2);
		calcularOperacao(new CalcularMultiplicar(), 2, 2);
		
		int soma = new Operacao(1, 3).soma();
		System.out.println(soma);
		int sub = new Operacao(3, 3).subtrai();
		System.out.println(sub);
		double div = new Operacao(6, 3).divide();
		System.out.println(div);
		int mult = new Operacao(3, 3).multiplica();
		System.out.println(mult);
		
		Bhaskara bha = new Bhaskara();
		bha.a = 1;
		bha.b = 3;
		bha.c = -4;
		
		double x1 = bha.ret1();
		double x2 = bha.ret2();
		
		System.out.println("x1 : "+x1);
		System.out.println("x2 : "+x2);
		
	}

}
