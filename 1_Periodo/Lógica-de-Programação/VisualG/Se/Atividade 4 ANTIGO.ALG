Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 28/03/2020
Var
   // Se��o de Declara��es das vari�veis
   nome: caracter
   mes: inteiro
   valor, prob1, prob2: real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva ("Digite o seu nome: ")
   leia (nome)
   escreva ("Digite o valor da compra: ")
   leia (valor)
   escreva ("Digite o n�mero do m�s de seu anivers�rio: ")
   leia (mes)

   prob1 <- valor / 2
   prob2 <- valor / 3

   se (mes > 12) entao
      escreva ("Inv�lido")
   senao
      se (valor < 699) entao
         escreva ("A compra do cliente ", nome, "no valor de ", valor, " n�o ser� poss�vel ser feito parcelamento")
      senao
         se (mes > 6) entao
            escolha (mes)
            caso (7), (9), (11)
               escreva ("A compra do cliente ", nome, "no valor de ", valor, " poder� parcelar em 2x de ", prob1)
            caso (8), (10), (12)
               escreva ("A compra do cliente ", nome, "no valor de ", valor, " poder� parcelar em 3x de ", prob2)
            fimescolha
         senao
            escolha (mes)
            caso (1), (3), (5)
               escreva ("A compra do cliente ", nome, "no valor de ", valor, " poder� parcelar em 3x de ", prob2)
            caso (2), (4), (6)
               escreva ("A compra do cliente ", nome, "no valor de ", valor, " poder� parcelar em 2x de ", prob1)
            fimescolha
         fimse
      fimse
   fimse

Fimalgoritmo