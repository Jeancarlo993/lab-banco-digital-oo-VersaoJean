# Criando um Banco Digital com Java e Orientação a Objetos

## 02/08/2021 - [Mentoria #1: Tire Suas Dúvidas Sobre Orientação a Objetos](https://www.youtube.com/watch?v=YS6ouOhkyNI)

Desafio: Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java. Para isso, vamos interpretar o seguinte cenário:
“Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

### Abstração
Habilidade de concentrar-se nos aspectos essenciais de um domínio, ignorando características menos importantes ou acidentais. Nesse contexto, objetos são abstrações de entidades existentes no domínio em questão.

### Encapsulamento
Encapsular significa esconder a implementação dos objetos, criando assim interfaces de uso mais concisas e fáceis de usar/entender. O encapsulamento favorece principalmente dois aspectos de um sistema: a manutenção e a evolução.

### Herança
Permite que você defina uma classe filha que reutiliza (herda), estende ou modifica o comportamento de uma classe pai. A classe cujos membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada.

### Polimorfismo
Capacidade de um objeto poder ser referenciado de várias formas, ou seja, é capacidade de tratar objetos criados a partir das classes específicas como objetos de uma classe genérica. Cuidado, polimorfismo não quer dizer que o objeto fica se transformando, muito pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar é a maneira como nos referimos a ele.

# Implementações que farei
* Implementar uma classe agência ok
* Mudar o atributo nome da classe banco para final e remover método set ok
* criar lista de Conta na classe agência ok
* criar uma parâmetro de lista de agências na classe banco ok
* criar métodos para adicionar e remover agências na classe banco ok
* na nova classe agências criar uma lista de clientes e métodos para adicionar e remover clientes ok
* na classe Cliente deve haver um parâmetro Conta ok
* remover parametro agencia da classe Conta ok
* remover parâmetro Cliente da classe Conta ok
* remover get agencia da classe conta ok
* método imprimirInfosComuns() mudará de local para a classe cliente ok
* implementar método calcularGanhos na classe ContaPoupanca
* Implementar classe CaixaEletronico, responsável por carregar os dados de um banco, carregar a agencia, o cliente e a conta de um usuário
* organizar todas as classes em pacotes "model", "controller" e "default package"
* em model ficarão as classes de conta, cliente, banco, agencia. Em controller ficará classe CaixaEletronico. No default package ficará a classe main
* Metodo construtor da classe CaixaEletronico instancia todos as classes banco, agencia, clientes, contas
