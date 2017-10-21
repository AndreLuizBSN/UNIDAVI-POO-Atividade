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
