Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 12/03/2020
Var
   // Seção de Declarações das variáveis
   numero1, numero2, numero3, trab2, media1, media2, trab1: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Qual a nota da primeria prova? ")
   leia (numero1)
   escreva ("Qual a nota da segunda prova? ")
   leia (numero2)
   escreva ("Qual a nota da terceira prova? ")
   leia (numero3)
   escreva ("Qual a nota do primero trabalho? ")
   leia (trab2)
   escreva ("Qual a nota do segundo trabalho? ")
   leia (trab1)

   media1<- (numero1 + trab1) / 2
   media2<- (((numero1 + numero2 + numero3) / 3) * 0.8) + (((trab1 + trab2) / 2) * 0.2)

   escreval ("A média aritimética é: ", media1)
   escreva ("A média ponderada é: ", media2)

Fimalgoritmo