# Pilares do POO

__Programacao orientada a objetos__ (__POO__, ou __OOP__ em ingles) e um paradigma da programacao baseado no conceito de "objetos", que podem conter dados
na forma de cmapos, tambem conhecidos como _atributos_, e codigos, na forma de procedimentos, tambem conhecidos como metodos.

A programacao orientada a objetos e bem requisitada no contexto das aplicacoes mais atuais no mercado devido a possibilidade de reutilizacao 
de codigo e a capacidade de representacao do sistema ser muito mais proximo do mundo real.

Para uma linguagem ser considerada orientada a objetos, esta deve seguir o que denominamos como __Os quatro pilares da orientacao a objetos__.

- __Encapsulamento__: Nem tudo precisa estar visivel, grande parte do nosso algoritmo pode ser distribuido em metodos com finalidades especificas que complementa uma acao em nossa aplicacao. Exemplo: Ligar um veiculo exige muitas etapas apra a engenharia, mas o condutor so visualiza a ignicao, dar a partida e a "magia" acontece.
- __Heranca__: Caracteristicas e comportamentos comuns podem ser elevados e compartilhados atraves de uma hierarquia de objetos. Exemplo: Um carro e uma Motocicleta possuem propriedades como placa, chassi, ano de fabricacao e metodos como acelerar, frear. Logo para nao ser um processo de codificacao redundante, podemos desfrutar da heranca criando uma classe __Veiculo__ para que seja herdada por Carro e Motocicleta.
- __Abstracao__: E a indisponibilidade para determinar a logica de um ou varios comportamentos em um objeto. Exemplo: Veiculo determina duas acoes como acelerar e frear, logo estes comportamentos deverao ser _abstratos_ pois existem mais de uma maneira de se realizar a mesma operacao
- __Polimorfismo__: Sao as inumeras maneiras de se realizar uma mesma acao. Exemplo: Veiculo determina as duas acoes como acelerar e frear, primeiramente precisamos identificar se estaremos nos referindo a Carro ou Motocicleta para determinar a logica de aceleracao e frenagem dos respectivos veiculos. 

A __Abstracao__ esta fortemente atrelada ao __Polimorfismo__!


## Interface

Como vimos anteriormente, __Heranca__ e um dos pilares de POO, mas uma curiosidade que se deve ser esclarecida na linguagem Java eque a mesma nao permite o que conhecemos como __Heranca Multipla__!

A Medida que vao surgindo novas necessidades, novo equipamentos (Objetos) nascem para atender as expectativas de oferecer ferramentas de finalidades bem especificas como por exemplo: Impressoras, Digitalizadoras, Copiadoras e etc.

Isso e o que consideramos o nivel mais abstrato da orientacao a objetos que denominamos como __interfaces__.

Considere V (verdadeiro) ou F (falso) nas seguintes afirmações sobre Polimorfismo: 
Capacidade de criar métodos com o mesmo nome, mas lista de parâmetros diferentes;
Capacidade de tratar objetos criados por classes específicas como objetos de uma classe genérica; 
Capacidade de um objeto poder ser referenciado de várias formas; Capacidade de um objeto transformar-se indefinidamente;
Define apenas um contrato a ser seguido, essencialmente abstrato.