Herança


#Definição
A herança é um princípio da POO que permite a criação de novas classes a partir de outras previamente criadas. Essas novas classes são chamadas de subclasses, ou classes derivadas; e as classes já existentes, que deram origem às subclasses, são chamadas de superclasses, ou classes base. Deste modo é possível criar uma hierarquia dessas classes, tornando, assim, classes mais amplas e classes mais específicas. Uma subclasse herda métodos e atributos de sua superclasse; apesar disso, pode escrevê-los novamente para uma forma mais específica de representar o comportamento do método herdado.
(Fonte:http://www.devmedia.com.br/entendendo-e-aplicando-heranca-em-java/24544)

#Exemplo
import java.util.Date;
public class Pessoa {
	public String nome;
	public String cpf;
	public Date data_nascimento;
	
	public Pessoa(String _nome, String _cpf, Date _data) {
		this.nome = _nome;
		this.cpf = _cpf;
		this.data_nascimento = _data;
	}
}
import java.util.Date;
public class Aluno extends Pessoa {
	public Aluno(String _nome, String _cpf, Date _data) {
		super(_nome, _cpf, _data);
	}
	public String matricula;
}
public class Professor extends Pessoa {
	public Professor(String _nome, String _cpf, Date _data) {
		super(_nome, _cpf, _data);
	}
	public double salario;
	public String disciplina;
}
public class Funcionario extends Pessoa {
	public Funcionario(String _nome, String _cpf, Date _data) {
		super(_nome, _cpf, _data);
	}
	public double salario;
	public Date data_admissao;
	public String cargo;
}
(Fonte:http://www.devmedia.com.br/entendendo-e-aplicando-heranca-em-java/24544)

#Ferramenta
-Verificar se tem o extends na classe

## Inspeção GITHUB
Origem: https://github.com/GoDieBawb/The-Dark/tree/master/The%20Dark/src/mygame

Classe 1:
https://github.com/GoDieBawb/The-Dark/blob/master/The%20Dark/src/mygame/GameManager.java
-Verificar se tem o extends na classe: PASSOU

Classe 2:
https://github.com/GoDieBawb/The-Dark/blob/master/The%20Dark/src/mygame/Main.java
-Verificar se tem o extends na classe:PASSOU

Classe 3:
https://github.com/GoDieBawb/The-Dark/blob/master/The%20Dark/src/mygame/util/AudioManager.java
-Verificar se tem o extends na classe: FALHOU

Classe 4:
https://github.com/GoDieBawb/The-Dark/blob/master/The%20Dark/src/mygame/util/UtilityManager.java
-Verificar se tem o extends na classe: FALHOU

Classe 5:
https://github.com/GoDieBawb/The-Dark/blob/master/The%20Dark/src/mygame/control/InteractionControl.java
-Verificar se tem o extends na classe: FALHOU



#Inspeção interna
#Hangman
Verificar se tem o extends na classe:PASSOU

#Calculadora
Verificar se tem o extends na classe:PASSOU


