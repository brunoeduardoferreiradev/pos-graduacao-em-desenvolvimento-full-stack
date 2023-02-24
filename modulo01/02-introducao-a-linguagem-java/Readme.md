# **Introdução à linguagem Java**

## **Introdução**

Durante todo o dia nós nos deparamos com algoritmos, desde quando acordamos até quando estamos dormindo. Afinal, um algoritmo é uma sequência finita de ações que tem como objetivo produzir solução para um dado problema. Por exemplo, se lhe perguntar como você faz para escovar seus dentes, você me dará uma lista com um passo a passo que vai desde pegar o tubo do creme dental até enxaguar a boca, fechando a torneira e guardando todos os itens no final do processo.

Algoritmo então não é apenas programação, mas também pode ser utilizado na programação de computadores. Deste modo, nesta aula você compreenderá os conceitos essenciais para o desenvolvimento de algoritmos e programação com a linguagem Java. Também verá que existem diversas ferramentas para o desenvolvimento de códigos. No final, conhecerá os principais conceitos relacionados a programação.

 

## **Objetivos da aula**

Compreender o conceito de variáveis e os dados que elas armazenam.
Reconhecer o tipo String e sua distinção com os demais tipos de dados.
Compreender as operações de entrada e saída de dados.
Conhecer os operadores aritméticos e como podem ser empregados em um algoritmo.
 

## **Resumo**

Para entender corretamente como construir um algoritmo, primeiramente é necessário compreender a lógica de programação.

A lógica é uma parte da filosofia que tem como objetivo estudar e aplicar as leis do raciocínio humano, logo, podemos concluir que é a arte de pensarmos corretamente, colocando o pensamento em ordem. Por exemplo, considere estas duas declarações:

Todo mamífero é animal

Cavalo é um mamífero

Analisando as declarações, podemos concluir logicamente que cavalo é um animal, afinal ele é um mamífero e todo mamífero é um animal.

Agora, considere o exemplo em que lhe é dada a sequência numérica: 1  1  2  3  5  8  13 ?.

Como definir qual será o próximo número da sequência? Neste caso, o próximo valor é o 21. Isso pode ser afirmado pois o valor atual é sempre a soma dos dois números anteriores:

3 + 2 = 5;
5 + 3 = 8;
5 + 8 = 13;
13 + 8 = 21.
Agora, considere a seguinte sequência numérica: 66  36  18  ?. Como definir qual será o próximo número desta sequência? Neste caso, o próximo valor é o 8. Isso pode ser afirmado pois o valor seguinte é sempre o resultado da multiplicação da dezena pela unidade do número anterior, observe:

Partindo do 66, temos 6*6 = 36;
3*6 = 18;
1*8 = 8.
Para estes dois últimos exemplos, observe que estipulamos (para cada um deles) uma sequência fixa e finita de procedimentos que nos leva até o resultado.

Podemos então concluir que um algoritmo deve possuir as seguintes características:

Cada passo do algoritmo deve ser uma instrução possível de ser realizada: considere o exemplo da viagem de Campinas até São Paulo. Existe uma sequência lógica de instruções e todas elas precisam ser executadas, se uma destas instruções não ocorrer, o algoritmo não será executado corretamente;
A ordem de cada uma das instruções deve ser respeitada: observe o segundo exemplo, nele o valor de um número X é obtido somando os dois valores anteriores a ele em uma sequência numérica. Se esta instrução não for obedecida (ou seja, se não somarmos o valor atual com o valor anterior para obter o próximo da sequência), o resultado não será conforme o esperado;
O algoritmo deve ser finito: considere ainda o segundo exemplo. O algoritmo é: para obter um valor X devemos somar os dois valores imediatamente anteriores. Observe que, apesar de ser possível obter uma sequência infinita de valores, o algoritmo é finito em suas instruções. O mesmo ocorre com os demais exemplos apresentados.
**Mas como podemos representar os algoritmos?** Tudo vai depender da proposta. Podemos representar os algoritmos por **pseudocódigo**, que é uma forma de escrever código de programação, porém em um código fictício, geralmente escrito em português. Outra maneira é a **narrativa**, ou seja, se alguém lhe perguntar: como faço para ir de São Paulo até Belo Horizonte, você indicará o caminho a seguir. Logo, você está narrando um passo a passo, ou seja, uma sequência de instruções. Os algoritmos também podem ser representados no formato de **fluxogramas**, que são formas geométricas ligadas por uma linha.

Porém, na programação de computadores, **os algoritmos são representados em uma linguagem própria chamada de linguagem de programação**. Uma linguagem de programação é uma notação projetada para conectar instruções a uma máquina ou um computador (FORBELLONE, 2005). As linguagens de programação são usadas principalmente para expressar algoritmos, sendo que algumas delas são utilizadas para objetivos gerais e outras para fins específicos. Muitas destas linguagens precisam ser declaradas de forma imperativa, enquanto outras linguagens de programação utilizam a forma declarativa. O programa pode ser dividido em duas formas, como sintaxe e semântica.

Cada linguagem de programação tende a suportar um estilo (ou paradigma) particular de programação. Embora vários fatores possam afetar a escolha da linguagem de programação para uma tarefa específica, incluindo preferência pessoal, política corporativa ou simplesmente a disponibilidade de conhecimento e experiência interna suficientes em uma linguagem específica, a linguagem selecionada deve ser a mais adequada para a tarefa em questão.

Dentre os principais paradigmas de linguagem de programação, temos (MANZANO, 2016):

- _**Paradigma imperativo ou estrutura sequencial**_: O paradigma consiste em várias instruções e, após a execução de todas elas, o resultado é armazenado em variáveis, que são espaços na memória reservados para guardar dados. Neste paradigma, uma lista de instruções é apresentada ao computador para que ele possa executá-las uma a uma, passo a passo;
- _**Paradigma procedural**_: Trata-se de um paradigma de programação estruturado baseado no conceito de chamada de procedimento, os comandos podem se apresentar como sub-rotinas, métodos ou funções. As principais linguagens são: C, C++, Java e Pascal;
- _**Paradigma orientado a objetos (POO)**_: Trata-se de um paradigma de programação que usa objetos para modelar entidades de dados. Embora a maioria das linguagens de programação tenha adotado características orientadas a objetos até certo ponto, as linguagens atualmente em destaque incluem: Java, Python, Ruby e C++;
- _**Paradigma de processamento paralelo**_: Neste paradigma, o processamento das instruções do programa é dividido entre vários processadores. Alguns exemplos de linguagens são o NESL (um dos mais antigos), C e C++;
- _**Paradigma declarativo**_:  Este paradigma permite que o programador instrua o computador sobre o que ele precisa fazer, sem se preocupar em instruí-lo como alcançar um objetivo. Logo, trata-se de um paradigma em que o programador define o que precisa ser realizado pelo programa sem definir como ele deve ser implementado;
- _**Paradigma de lógica**_: O paradigma da programação lógica não é composto de instruções - é composto de fatos e cláusulas. Ele usa tudo o que sabe e tenta criar o mundo onde todos esses fatos e cláusulas são verdadeiros. Algumas linguagens são o Prolog, Alice e Ciao;
- _**Paradigma funcional**_ : Trata-se de um paradigma que está no centro das atenções há um tempo por causa do JavaScript, uma linguagem de programação funcional que ganhou mais popularidade recentemente. Exemplos de linguagens: JavaScript, Scala e Haskell.
Cabe destacar que não existe o melhor paradigma ou o paradigma certo. Tudo dependerá da finalidade do projeto o qual você está desenvolvendo.

Independentemente do paradigma escolhido ou até mesmo da linguagem de programação, alguns conceitos são fundamentais e merecem uma atenção a mais. A começar pelas variáveis.

Ao criarmos nossos programas, é necessário que os valores permaneçam em memória, de modo que estes dados possam ser reaproveitados no código. Este é o conceito de variável.

Uma variável representa um local da memória que é usado para armazenar um valor, o qual pode ser do tipo numérico, caractere ou lógico. O valor da variável na memória pode ser manipulado a qualquer instante, podendo ser alterada durante a execução do nosso programa.

Pense na memória do computador como sendo uma rua. Agora, considere que nesta rua nós temos diversas casas, uma ao lado da outra. As casas são como variáveis: você pode entrar em uma casa, morar nela e também pode sair. Se você quiser saber quem mora na casa número 85 da rua memória, basta você bater na porta e perguntar: “quem está aí?”. Com as variáveis é a mesma coisa: você pode chamá-la em seu código e manipular seu valor interno.

Essa manipulação pode ser realizada via entrada do usuário, seja digitando em um teclado ou escolhendo uma opção em um menu touchscreen no celular. Por outro lado, a saída é o resultado de uma operação ou de uma transação. Observe que, seja na entrada ou na saída, estamos lidando com dados.

Os dados são os tipos brutos que manipulamos durante as transações. Você pode solicitar em seu programa que o usuário informe o ano de nascimento, por exemplo. Com este dado, você é capaz de realizar um cálculo e saber quantos anos ele tem ou disparar um e-mail o cumprimentando pelo seu aniversário.

Em linguagens como o Java, por exemplo, podemos lidar com números, valores booleanos e também com cadeias de caracteres.

Na linguagem Java podemos encontrar números de ponto flutuante e inteiros. Os números inteiros são definidos como int, por exemplo 35, 832, 421, entre outros. Os números de ponto flutuante são definidos como double ou float, por exemplo 0.0, 88.5, 64.33, entre outros. Existe mais um tipo de tipo de dados nesta categoria, que é o long, o qual é usado para armazenar números inteiros mais longos.

Estes dados numéricos armazenados em memória podem ser manipulados, principalmente, por meio de operações aritméticas (assim como na matemática).

Na programação, podemos utilizar os operadores de soma (+), subtração (-), divisão (/), multiplicação (*) e de módulo (%).

Observe que os operadores utilizados na linguagem Java devem seguir a mesma ordem de precedência da matemática, logo, em uma operação como 8 – 4 * 3 / 2 + 6, a primeira operação será a de multiplicação, seguida da operação de divisão e, por fim, as operações de soma e subtração. Se o programador desejar que a operação de soma seja a primeira a ser realizada, o indicado é que se coloque a expressão entre parênteses.

Assim como em outras linguagens, em Java as strings são identificadas como uma sequência de caracteres representados entre aspas. Um número entre aspas é um caractere do tipo string, porém, um número sem aspas se torna um tipo numérico (inteiro ou ponto flutuante).

## **Tópicos avançados**

Algoritmos, abstração, decomposição e reconhecimento de padrões são pilares do chamado Pensamento Computacional. Pensar computacionalmente não é o mesmo que pensar como um computador, mas sim, pensar racionalmente para resolver problemas. Você pode compreender mais sobre pensamento computacional lendo o artigo Pensamento Computacional na educação básica acessando o link: <http://ojs.sector3.com.br/index.php/rbie/article/view/v29p604>. 

 
Referência Bibliográfica

FORBELLONE, A. L. V.; EBERSPACHER, H. F. Lógica de programação: a construção de algoritmos e estruturas de dados. São Paulo: Prentice Hall, 2005.

MANZANO, J. A. N. G. Algoritmos: lógica para desenvolvimento de programação de computadores. 28. ed. São Paulo: Érica, 2016

______


# **Exercícios**

> 1 - Apesar de parecer um conceito longe de nossa realidade e, em muitos casos, ser associado a programação de computadores, os algoritmos estão contidos em nosso cotidiano em diversos momentos e em diversas atividades do dia. Sobre os algoritmos, marque a alternativa que corretamente os define.
- 🔳 - a - Nas embalagens de produtos diversos, o item modo de usar é um exemplo de algoritmo em pseudocódigo
- 🔳 - b - O algoritmo é uma sequência com quantidade indeterminada de instruções com o objetivo de resolver um problema
- 🔳 - c - Fluxograma ou diagramas de sequência são exemplos de representações de um algoritmo
- ✅ - d - Cada instrução de um algoritmo deve ser executada em uma ordem específica para resolver um problema computacional ou não
- 🔳 - e - Fluxograma e diagramas de sequência são exemplos de representações gráficas visuais de um algoritmo

> 2 - Embora não haja uma maneira definitiva de classificar ou agrupar os tipos de linguagens de programação, uma abordagem comum é dividi-los em estilos de programação ou, formalmente definido, em paradigmas.
Considerando esse contexto, avalie as seguintes asserções e a relação proposta entre elas.
I. Uma característica da linguagem imperativa é que ela consiste em várias instruções que são executadas sequencialmente, passo a passo.
PORQUE
II. Linguagens do paradigma imperativo expressam comandos para o computador executar, se concentrando no processo explícito de o que um programa deve fazer e como este programa deve fazer
Sobre a relação entre as asserções, é correto afirmar que:
- 🔳 - a - As asserções I e II são proposições falsas
- 🔳 - b - A asserção I é uma proposição falsa, e a II é uma proposição verdadeira
- 🔳 - c - A asserção I é uma proposição verdadeira, e a II é uma proposição falsa
- 🔳 - d - As asserções I e II são proposições verdadeiras, mas a II não é uma justificativa da I
- ✅ - e - As asserções I e II são proposições verdadeiras, e a II é uma justificativa da I

> 3 - Um algoritmo representa um conjunto de instruções para que algo seja feito. Uma receita, uma bula de remédio ou um manual de instruções são considerados algoritmos descritivos, uma vez que descrevem passo a passo o que deve ser feito e como deve ser feito. Quais os tipos de representações mais comuns?

- 🔳 - a - Código de programação, programas e fluxogramas
- ✅ - b - Descrição narrativa, fluxograma e pseudocódigo
- 🔳 - c - Pseudocódigo, código de programação e programas
- 🔳 - d - Fluxograma, pseudocódigo e programas
- 🔳 - 3 - Descrição narrativa, pseudocódigo e programas


> 4 - No desenvolvimento de softwares, as linguagens de programação em geral como Java, entre outras, possuem operadores aritméticos com a mesma função dos operadores da matemática, cada qual com suas ações específicas. Com estes operadores, podemos realizar as operações matemáticas básicas como soma, subtração, multiplicação e divisão, bem como outros tipos de operações. Um exemplo de uso da potência do tipo quatro ao cubo ou quatro elevado a três (4³) em Java está descrito na instrução:

- ✅ - a - total = 4 * 4 * 4
- 🔳 - b - total = 4^3
- 🔳 - c - total = 4³
- 🔳 - d - total = 4 % 3
- 🔳 - e - total = cubo(4)

<br/>
<br/>

# Estruturas Condicionais
## Introdução

Algoritmo é definido como uma sequência de instruções que possui um início e fim bem delimitados. Até este ponto você deve compreender. Mas vamos analisar a palavra sequência. Os algoritmos mais simples, como aqueles para realizar uma operação aritmética sobre dois números, por exemplo, possui a entrada (os números que vamos realizar a operação), um processamento (que é a soma) e um resultado.

Analisando de perto, temos uma sequência encadeada de instruções. Porém, e se o usuário não informar um número, ou então, ao invés de informar um número ele informar uma letra? E se o valor informado for negativo? São muitos os que podemos considerar, ou seja, muitas condições que podem ser impostas em um único código. Nesta aula, compreenderemos o conceito de fluxo de código, bem como, conheceremos as principais estruturas condicionais utilizadas neste controle de fluxo.

## Objetivos da aula

Compreender o conceito de controle de fluxo de código.
Reconhecer os tipos de operadores lógicos e de comparação.
Compreender o significado de cada tipo de estrutura de controle de fluxo.
Diferenciar as estruturas de condição simples, composta e aninhada.
 
## Resumo

Antes de começarmos a trabalhar o conceito de estrutura de decisão e também sobre estrutura de repetição, vamos entender um pouco mais sobre o fluxo de um algoritmo. Considere o algoritmo da figura 1 a seguir.

<div align="center">
![image](https://user-images.githubusercontent.com/125761885/221072170-3fb2da55-777f-4f41-ab76-5b014cba789f.png)
</div>

Figura 1 – Algoritmo com estrutura sequencial Fonte: Elaborado pelo autor

Na figura 1, o algoritmo é responsável por declarar e receber três notas de um aluno, em seguida é realizado o cálculo para obter a média final. Por fim, a média é apresentada na tela para o usuário. Observe então que se trata de uma sequência linear de instruções. A esta sequência chamamos de fluxo.

Porém, qual a razão de se calcular uma média se não for para dizer se o aluno está com desempenho satisfatório ou insatisfatório? Em outras palavras, se calcularmos a média, desejamos saber se o aluno está aprovado ou se está reprovado. Aqui nós utilizaremos um conceito de controle de fluxo, onde vamos alterar o fluxo do nosso código de acordo com a média do aluno. Por exemplo, se a nota for maior ou igual a 6, significa que ele está aprovado, caso contrário, ele estará reprovado.

Para tanto, precisamos primeiramente utilizar os operadores relacionais, os quais recebem este nome pois relacionam um operando da esquerda com outro operando da direita. O resultado desta expressão será utilizado em uma estrutura condicional para indicar para qual caminho o fluxo do código seguirá.

Em qualquer linguagem de programação, as estruturas condicionais, também conhecidas como estrutura de decisão ou de controle, são utilizadas para manipular o fluxo de um código (MANZANO, 2016). Sem essas estruturas, uma linguagem de programação é basicamente inútil, afinal, não será capaz de tomar decisões inteligentes por conta própria.

Para que seja possível utilizarmos as estruturas de decisão, precisamos de ter 2 componentes essenciais:

* Operadores de comparação:
  * **>** (maior);
  * **<** (menor);
  * **>=** (maior ou igual);
  * **<=** (menor ou igual);
  * **==** (igual); 
  * **!=** (diferente).

* operadores lógicos:
  * **&&** (operador e em C, Java, C#, JavaScript, entre outras);
  * **and** (operador e em Python);
  * **||** (operador ou em C, Java, C#, JavaScript, entre outras);
  * **or** (operador ou em Python).
 
Os operadores de comparação, como o nome indica, compara um valor/expressão do lado esquerdo com um valor/expressão do lado direito. O retorno será true ou false.

Os operadores lógicos realizam uma conexão entre duas expressões, é o que se denomina Expressões Lógicas ou Expressões Booleanas. A tabela 1 a seguir apresenta um exemplo do uso dos operadores de comparação e operadores lógicos, bem como suas saídas em Java. Considere que a variável X possui o valor 4 e a variável Y possui o valor 8.

 


Observe que o operador && (operador e), para que tenha uma saída verdadeira, precisa que todas as expressões ligadas por este operador também sejam verdadeiras. Por outro lado, ao utilizar um operador || (operador ou), para que a saída seja verdadeira, basta que qualquer expressão tenha o valor verdadeiro.

Agora que você conhece os operadores, a montagem das instruções e as saídas destas instruções, chegou a hora de conhecermos as estruturas condicionais.

A estrutura condicional if é a primeira que trabalharemos. O seu papel é dividir o fluxo do código. Observe o diagrama da figura 2.

 

Figura 2 - Estrutura condicional if Fonte: Elaborado pelo autor
Figura 2 - Estrutura condicional if Fonte: Elaborado pelo autor

Observe na figura 2 o fluxo sequencial do algoritmo representado pela seta superior descendente. Em um dado momento, o fluxo de execução encontra uma estrutura de decisão (representado pelo losango). Nesta estrutura de decisão teremos uma expressão lógica ou uma comparação entre dois valores. Caso a condição seja falsa, o fluxo de execução continuará. Porém, caso a condição seja verdadeira, o fluxo do código será alterado, executando uma outra sequência de instruções (FORBELLONE, 2005). O código 1 a seguir ilustra o uso da estrutura if.

 


Observe que uma estrutura condicional é representada pela palavra-chave if, seguida de uma expressão lógica. O conteúdo da linha 3 só será apresentado na tela quando se o valor de x for maior que o valor da variável y. Porém, neste caso, não será apresentado nada, afinal, o valor de x não é maior que o valor de y. Neste caso, temos a opção de utilizar uma estrutura condicional composta como ilustra a figura 3 a seguir.

 

Figura 3 - Estrutura condicional aninhada e composta Fonte: Elaborado pelo autor
Figura 3 - Estrutura condicional aninhada e composta Fonte: Elaborado pelo autor

Observe pela figura 3 que o fluxo do código estava sequencial em (a). Entretanto, em um primeiro momento ele encontrou uma condição if. Caso a expressão seja verdadeira, o fluxo do código seguirá em (b) e, assim, executará as instruções internas ao if, seguindo o fluxo (c) até concluir em (x). Podemos então atualizar o código 1 para o código 2 a seguir.
 
|     |      |
|-----|----|
| 1   | int x = 4, y=8;   |
| 2   | if(x>y){ |
| 3   | System.out.println(“O valor de x é maior que o valor de y”); |
| 4   | } |
| 5   | else if(x<y){ |
| 6   | System.out.println(“O valor de x é menor que o valor de y”); |
| 7   | } |
| 8   | else { |
| 9   | System.out.println(“O valor de x é igual a y”); |
| 10  | } |

Código 2 – Estrutura condicional if composta

Observe agora pelo código 2 que temos 3 condições: se x for maior que y, se x for menor que y e uma saída para o caso onde x não é maior e nem menor, ou seja, para quando x for igual a y. O conteúdo das linhas 3, 6 ou 9 só serão apresentados na tela se as condições forem verdadeiras.

Com isso é possível concluir que as estruturas condicionais são responsáveis por controlar o fluxo do código. Considere, por exemplo, uma aplicação como das redes sociais Instagram ou Facebook. Ao acessá-las, você precisa colocar um nome de usuário e senha. Se o nome de usuário e senha estiverem corretos, você terá acesso a aplicação. Por outro lado, se não estiverem corretos, você não terá acesso. Note então que a condicional é essencial em qualquer linguagem de programação e para todo tipo de projeto de software.

## Tópicos avançados

Observando as tabelas verdade, vemos que TRUE e/ou TRUE retorna TRUE. As tabelas verdade completas, fornecem exemplos das equações básicas usadas na lógica e suas conclusões. Essas tabelas matemáticas comuns são úteis para memorizar ou manter em mente ao construir algoritmos (instruções) na programação de computadores.

Estes algoritmos lógicos podem ser aplicados em diferentes cenários e um dos mais promissores é a inteligência artificial ou IA.

Na programação de computador usada para criar os algoritmos de IA, a lógica se traduz em valores "Booleanos" de verdadeiro e falso com base em declarações condicionais if/else.

A Inteligência Artificial é o ramo da ciência da computação que pesquisa e estuda a capacidade de programar softwares que utilizam a lógica para tomar decisões, imitando o raciocínio humano, só que mais rápido e preciso.

Então, como ele consegue isso? A IA deriva conclusões lógicas com base em uma combinação de três fatores principais que incluem:

Dados históricos arquivados são usados ​​como base para construir as regras e conclusões lógicas que se encaixam no cenário.
Novos dados de entrada são continuamente adicionados à base para dar suporte adicional à lógica.
A interação humana em tempo real ocorre quando uma decisão não é clara.
Esses fatores são as chaves usadas na construção e treinamento de algoritmos complexos que realizam cálculos de resolução de problemas.

Para compreender mais sobre inteligência artificial, acesse o link < https://www.neuralmed.ai/blog/inteligencia-artificial>. (acesso em 08/11/2022)

## Referência Bibliográfica

FORBELLONE, A. L. V.; EBERSPACHER, H. F. Lógica de programação: a construção de algoritmos e estruturas de dados. São Paulo: Prentice Hall, 2005.

MANZANO, J. A. N. G. Algoritmos: lógica para desenvolvimento de programação de computadores. 28. ed. São Paulo: Érica, 2016.
