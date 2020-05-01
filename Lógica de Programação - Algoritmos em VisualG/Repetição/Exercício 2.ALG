Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 11/04/2020
Var
   // Seção de Declarações das variáveis
   num, indice, contador: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Digite um número: ")
   leia (num)

   para indice <- 1 ate num faca
      se (num % indice = 0) entao
         contador <- contador + 1
      fimse
   fimpara

   se (contador = 2) entao
      escreval (num, " É primo")
   senao
      escreval (num, " Não é primo")
   fimse

Fimalgoritmo