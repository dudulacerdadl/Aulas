Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 28/03/2020
Var
   // Se��o de Declara��es das vari�veis
   area, custo: real
   tipe: inteiro

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva ("Infome a �rea de pulveriza��o: ")
   leia (area)
   escreval
   escreval ("Tipo 1: Pulveriza��o contra ervas daninhas, custo de R$0,50 por �rea")
   escreval ("Tipo 2: Pulveriza��o contra gafanhotos, custo de R$1,00 por �rea")
   escreval ("Tipo 3: Pulveriza��o contra broca, custo de R$1,50 por �rea")
   escreval ("Tipo 4: Pulveriza��o contra os tipos 01, 02 e 03, custo de R$2,50 por �rea")
   escreval
   escreval ("Informe o n�mero do tipo de pulveriza��o: ")
   leia (tipe)

   escolha (tipe)
   caso (1)
      custo <- area * 0.5
   caso (2)
      custo <- area * 1
   caso (3)
      custo <- area * 1.5
   caso (4)
      custo <- area * 2.5
   outrocaso
      escreva ("Inv�lido")
   fimescolha

   escreva ("Seu custo ser� de: ", custo)

Fimalgoritmo