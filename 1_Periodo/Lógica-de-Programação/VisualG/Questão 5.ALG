Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 06/03/2020
Var
   // Se��o de Declara��es das vari�veis
   atual, nascimento, idade1, idade2: inteiro

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva ("Informe o seu ano de nascimento: ")
   leia (nascimento)
   escreva ("Informe o ano atual: ")
   leia (atual)
   idade1 <- atual - nascimento
   idade2 <- 2030 - nascimento
   escreval ("Sua idade atualmente �: ", idade1)
   escreva ("Sua idade em 2030 ser�: ", idade2)

Fimalgoritmo