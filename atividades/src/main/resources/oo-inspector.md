Dupla: André Luiz Alexandrini, Júlia Koch Eberspächer.

# Encapsulamento

## Definições
"Encapsulamento vem de encapsular, que em programação orientada a objetos significa separar o programa em partes, o mais isolado possível. A idéia é tornar o software mais flexível, fácil de modificar e de criar novas implementações. O Encapsulamento serve para controlar o acesso aos atributos e métodos de uma classe. É uma forma eficiente de proteger os dados manipulados dentro da classe, além de determinar onde esta classe poderá ser manipulada. Usamos o nível de acesso mais restritivo, private, que faça sentido para um membro particular. Sempre usamos private, a menos que tenhamos um bom motivo para deixá-lo com outro nível de acesso. Não devemos permitir o acesso público aos membros, exceto em caso de ser constantes. Isso porque membros públicos tendem a nos ligar a uma implementação em particular e limita a nossa flexibilidade em mudar o código. O encapsulamento que é dividido em dois níveis:
Nível de classe: Quando determinamos o acesso de uma classe inteira que pode ser public ou Package-Private (padrão);
Nível de membro: Quando determinamos o acesso de atributos ou métodos de uma classe que podem ser public, private, protected ou Package-Private (padrão).
Então para ter um método encapsulado utilizamos um modificador de acesso que geralmente é public, além do tipo de retorno dele. Para se ter acesso a algum atributo ou método que esteja encapsulado utiliza-se o conceito de get e set. Por definição, com SET é feita uma atribuição a algum atributo, ou seja, define, diz o valor que algum atributo deve ter. E  com GET é possível recuperar esse valor."
Fonte: http://www.devmedia.com.br/encapsulamento-polimorfismo-heranca-em-java/12991

"Quando sabemos O QUÊ um método faz (igual ao método adiciona, sabemos que ele adiciona um item no pedido, por causa do nome dele), mas não sabemos exatamente como ele faz, dizemos que esse comportamento está encapsulado. A partir do momento que as outras classes não sabem como a classe principal faz o seu trabalho, significa que as mudanças ocorrerão apenas em um lugar! Afinal, elas estão escondidas (encapsuladas).
No fim, a real utilidade do private é esconder acesso de atributos que precisam ser acessados de maneira mais inteligente. Mas veja que de nada adianta colocar todos os atributos como private e criar getters e setters para todos eles. Deixamos o encapsulamento “vazar” do mesmo jeito.
Esconda os atributos, mas pense em comportamentos inteligentes para acessá-los. Uma ótima maneira para saber se o comportamento está encapsulado é olhar para o código que faz uso dele! Se conseguirmos dizer o que o método faz, mas sem dizer como ele faz, então podemos afirmar que o comportamento está encapsulado."
Fonte: http://blog.caelum.com.br/revisitando-a-orientacao-a-objetos-encapsulamento-no-java/


## Exemplos
public class TV {
	private int tamanho;
	private int canal;
	private int volume;
	private boolean ligada;
	public TV(int tamanho) {
		this.tamanho = tamanho;
		this.canal = 0;
		this.volume = 0;
		this.ligada = false;
	}
	// abaixo vem todos os métodos construtores get e set...
	// Encapsulamento
}
 
public interface ControleRemoto {
	void mudarCanal(int canal);
	void aumentarVolume (int taxa);
	void diminuirVolume (int taxa);
	boolean ligar();
	boolean desligar();
}
Fonte: http://www.devmedia.com.br/encapsulamento-polimorfismo-heranca-em-java/12991

## Ferramenta
-Nenhum método privado(criar classe default-acessível dentro do pacote apenas-com os métodos privados)
-O que o código faz? (Deve ser possível responder)
-Como ele faz?  (Não deve ser possível responder)

## Inspeção
Origem: https://github.com/GoDieBawb/The-Dark/tree/master/The%20Dark/src/mygame

Classe 1:
https://github.com/GoDieBawb/The-Dark/blob/master/The%20Dark/src/mygame/GameManager.java
-Nenhum método privado(criar classe default - acessível dentro do pacote apenas - com os métodos privados):  FALHOU
-O que o código faz? (deve ser possível responder): FALHOU
-Como ele faz?  (Não deve ser possível responder): FALHOU

Classe 2:
https://github.com/GoDieBawb/The-Dark/blob/master/The%20Dark/src/mygame/Main.java
-Nenhum método privado(criar classe default - acessível dentro do pacote apenas - com os métodos privados):  PASSOU
-O que o código faz? (deve ser possível responder):  FALHOU
-Como ele faz?  (Não deve ser possível responder):  FALHOU

Classe 3:
https://github.com/GoDieBawb/The-Dark/blob/master/The%20Dark/src/mygame/util/AudioManager.java
-Nenhum método privado(criar classe default - acessível dentro do pacote apenas - com os métodos privados):  PASSOU
-O que o código faz? (deve ser possível responder): PASSOU
-Como ele faz?  (Não deve ser possível responder): PASSOU

Classe 4:
https://github.com/GoDieBawb/The-Dark/blob/master/The%20Dark/src/mygame/util/UtilityManager.java
-Nenhum método privado(criar classe default - acessível dentro do pacote apenas - com os métodos privados):  FALHOU
-O que o código faz? (deve ser possível responder): PASSOU
-Como ele faz?  (Não deve ser possível responder): PASSOU

Classe 5:
https://github.com/GoDieBawb/The-Dark/blob/master/The%20Dark/src/mygame/control/InteractionControl.java
-Nenhum método privado(criar classe default - acessível dentro do pacote apenas - com os métodos privados):  PASSOU
-O que o código faz? (deve ser possível responder): PASSOU
-Como ele faz?  (Não deve ser possível responder): PASSOU




# Herança

## Definições
A herança é um mecanismo da Orientação a Objeto que permite criar novas classes a partir de classes já existentes, aproveitando-se das características existentes na classe a ser estendida. Este mecanismo é muito interessante, pois promove um grande reuso e reaproveitamento de código existente.  Com a herança é possível criar classes derivadas, subclasses, a partir de classes bases, superclasses. As subclasses são mais especializadas do que as suas superclasses, mais genéricas. As subclasses herdam todas as características de suas superclasses, como suas variáveis e métodos. A linguagem Java permite o uso de herança simples, mas não permite a implementação de herança múltipla. Para superar essa limitação o Java faz uso de interfaces, o qual pode ser visto como uma “promessa”que certos métodos com características previamente estabelecidas serão implementados, usando inclusive a palavra reservada implements para garantir esta implementação. As interfaces possuem sintaxe similar as classes, no entanto apresentam apenas a especificação das funcionalidades que uma classe deve conter, sem determinar como essa funcionalidade deve ser implementada. Apresentam apenas protótipos dos métodos.

Por exemplo, Imagine que dentro de uma organização empresarial, o sistema de RH tenha que trabalhar com os diferentes níveis hierárquicos da empresa, desde o funcionário de baixo escalão até o seu presidente. Todos são funcionários da empresa, porém cada um com um cargo diferente. Mesmo a secretária, o pessoal da limpeza, o diretor e o presidente possuem um número de identificação, além de salário e outras características em comum. Essas características em comum podem ser reunidas em um tipo de classe em comum, e cada nível da hierarquia ser tratado como um novo tipo, mas aproveitando-se dos tipos já criados, através da herança. Os subtipos, além de herdarem todas as características de seus supertipos, também podem adicionar mais características, seja na forma de variáveis e/ou métodos adicionais, bem como reescrever métodos já existentes na superclasse, polimorfismo. A herança permite vários níveis na hierarquia de classes, podendo criar tantos subtipos quanto necessário, até se chegar ao nível de especialização desejado. Podemos tratar subtipos como se fossem seus supertipos, por exemplo, o sistema de RH pode tratar uma instância de Presidente como se fosse um objeto do tipo Funcionário, em determinada funcionalidade. Porém não é possível tratar um supertipo como se fosse um subtipo, a não ser que o objeto em questão seja realmente do subtipo desejado e a linguagem suporte este tipo de tratamento, seja por meio de conversão de tipos ou outro mecanismo. Algumas linguagens de programação permitem herança múltipla, ou seja, uma classe pode estender características de várias classes ao mesmo tempo. É o caso do C++. Outras linguagens não permitem herança múltipla, por se tratar de algo perigo se não usada corretamente. É o caso do Java. Na Orientação a Objetos as palavras classe base, supertipo, superclasse, classe pai e classe mãe são sinônimos, bem como as palavras classe derivada, subtipo, subclasse e classe filha também são sinônimos.
Fonte: http://www.devmedia.com.br/encapsulamento-polimorfismo-heranca-em-java/12991



## Exemplos
public abstract class GameBase {

	public abstract void jogada(char[] estadoAtualChar, String novaEntrada);
	public abstract int getWrongs();	
	public abstract int getLimit();
	public abstract boolean isCanPlay();
	public abstract boolean isGotcha();	
}

public class Jogo extends GameBase{
	
	private boolean gotcha = false;
	private int wrongs = 0;
	private int limit = 6;
	private boolean canPlay = true;
	private Passe passe;
	private String placeholderAsString;
	
	public Jogo(Passe passe){
		this.passe = passe;
	}
	
	@Override
	public void jogada(char[] placeholder, String attempt){
		boolean hit = false;
		this.gotcha = true;
		this.placeholderAsString = "";
		for (int i = 0; i < passe.getPass().length(); i++) {
			if (passe.getPass().charAt(i) == attempt.charAt(0)) {
				placeholder[i] = attempt.charAt(0);
				hit = true;
			}
			this.gotcha = this.gotcha & (passe.getPass().charAt(i) == placeholder[i]);
			this.placeholderAsString += placeholder[i];
		}
		if (!hit)
			this.wrongs++;
		this.canPlay = this.wrongs < limit && !gotcha;
	}
	
	@Override
	public int getWrongs(){
		return this.wrongs;
	}
	@Override
	public int getLimit(){
		return this.limit;
	}
	
	public String getPlaceholderAsString(){
		return this.placeholderAsString;
	}
	@Override
	public boolean isCanPlay(){
		return this.canPlay;
	}
	@Override
	public boolean isGotcha(){
		return this.gotcha;
	}
}



## Ferramenta
-se a classe pai tiver metodos, devem ser implementadas na classe filho usando a anotação @Override

-se a classe pai tiver atributos publicos, a classe que extende ve

## Inspeção
Origem: https://github.com/GoDieBawb/The-Dark/tree/master/The%20Dark/src/mygame

Classe 1:
https://github.com/GoDieBawb/The-Dark/blob/master/The%20Dark/src/mygame/GameManager.java
-Nenhum método privado(criar classe default - acessível dentro do pacote apenas - com os métodos privados):  FALHOU
-O que o código faz? (deve ser possível responder): FALHOU
-Como ele faz?  (Não deve ser possível responder): FALHOU

Classe 2:
https://github.com/GoDieBawb/The-Dark/blob/master/The%20Dark/src/mygame/Main.java
-Nenhum método privado(criar classe default - acessível dentro do pacote apenas - com os métodos privados):  PASSOU
-O que o código faz? (deve ser possível responder):  FALHOU
-Como ele faz?  (Não deve ser possível responder):  FALHOU

Classe 3:
https://github.com/GoDieBawb/The-Dark/blob/master/The%20Dark/src/mygame/util/AudioManager.java
-Nenhum método privado(criar classe default - acessível dentro do pacote apenas - com os métodos privados):  PASSOU
-O que o código faz? (deve ser possível responder): PASSOU
-Como ele faz?  (Não deve ser possível responder): PASSOU

Classe 4:
https://github.com/GoDieBawb/The-Dark/blob/master/The%20Dark/src/mygame/util/UtilityManager.java
-Nenhum método privado(criar classe default - acessível dentro do pacote apenas - com os métodos privados):  FALHOU
-O que o código faz? (deve ser possível responder): PASSOU
-Como ele faz?  (Não deve ser possível responder): PASSOU

Classe 5:
https://github.com/GoDieBawb/The-Dark/blob/master/The%20Dark/src/mygame/control/InteractionControl.java
-Nenhum método privado(criar classe default - acessível dentro do pacote apenas - com os métodos privados):  PASSOU
-O que o código faz? (deve ser possível responder): PASSOU
-Como ele faz?  (Não deve ser possível responder): PASSOU
