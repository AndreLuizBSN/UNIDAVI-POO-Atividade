package calc;


public class Calculadora {

	public static void main(String[] args) {
		int soma = new Operacao(1, 3).soma();
		System.out.println(soma);
		int sub = new Operacao(3, 3).subtrai();
		System.out.println(sub);
		double div = new Operacao(6, 3).divide();
		System.out.println(div);
		int mult = new Operacao(3, 3).multiplica();
		System.out.println(mult);
	}

}
