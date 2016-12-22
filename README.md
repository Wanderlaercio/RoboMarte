# Informa��es acerca da aplica��o
##Projeto desafio Rob� Marte
-O Problema:
Um time de rob�s devem ser colocados pela NASA para explorar um terreno em Marte.
Esse terreno, que � retangular, precisa ser navegado pelos rob�s de tal forma que suas c�meras acopladas possam obter uma vis�o completa da regi�o, enviando essas imagens novamente para a Terra.

A posi��o de cada rob� � representada pela combina��o de coordenadas cartesianas (x, y) e por uma letra, que pode representar uma das quatro orienta��es: NORTH, SOUTH, EAST e WEST. Para simplificar a navega��o, a regi�o �marciana� a ser explorada foi subdividia em sub-regi�es retangulares.
Uma posi��o v�lida de um rob�, seria (0, 0, N), que significa que o rob� est� posicionado no canto esquerdo inferior do terreno, voltado para o Norte.
Para controlar cada rob�, a NASA envia uma string simples, que pode conter as letras �L�, �R� e �M�. As letras �L� e �R� fazem o rob� rotacionar em seu pr�prio eixo 90 graus para esquerda ou para direita, respectivamente, sem se mover da sua posi��o atual. A letra �M� faz o rob� deslocar-se uma posi��o para frente.
Assuma que um rob� se movimenta para o NORTE em rela��o ao eixo y. Ou seja, um passo para o NORTE da posi��o (x,y), � a posi��o (x, y+1)
Exemplo: Se o rob� est� na posi��o (0,0,N), o comando "MML" far� ele chegar na posi��o (0,2,W)

##Requisitos Funcionais
O terreno dever� ser iniciado com 5x5 posi��es;
O rob� inicia na coordenada (0,0,N);
Dever� ser poss�vel enviar um comando para o Rob� que me retorne a posi��o final dele;
O Rob� n�o pode se movimentar para fora da �rea especificada;
N�o deve guardar estado do rob� para consulta posterior;


##Requisitos T�cnicos
O desafio deve ser entregue escrito em Java;
O projeto dever� ser compilado utilizando somente o Maven;
Dever�o ser utilizadas apenas as biblioteca do JEE e JUnit;
O desafio ser� executado na �ltima vers�o do Wildfly;
A interface de comunica��o com o rob� � REST;

##Cen�rios de Teste
Alguns cen�rios de teste:
Movimento com rota��es para direita:
curl -s --request POST http://localhost:8080/rest/mars/MMRMMRMM
Sa�da esperada: (2, 0, S)
Movimento para esquerda:
Entrada: curl -s --request POST http://localhost:8080/rest/mars/MML
Sa�da esperada: (0, 2, W)
Repeti��o da requisi��o com movimento para esquerda:
Entrada: curl -s --request POST http://localhost:8080/rest/mars/MML
Sa�da esperada: (0, 2, W)
Comando inv�lido:
curl -s --request POST http://localhost:8080/rest/mars/AAA
Sa�da esperada: 400 Bad Request
Posi��o inv�lida:
curl -s --request POST http://localhost:8080/rest/mars/MMMMMMMMMMMMMMMMMMMMMMMM
Sa�da esperada: 400 Bad Request

# Informa��es acerca do servidor
O servidor utilizado para rodar a aplica��o foi o Wildfly 10.0

# Maven
Deve ser utilizado Maven 3

# Comando Maven
## Rodar testes
mvn test
## Compilar aplicacao
mvn clen compile
## Realizar build para deploy
mvn package