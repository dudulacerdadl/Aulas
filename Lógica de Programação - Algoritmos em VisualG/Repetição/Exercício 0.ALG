Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 11/04/2020
Var
   // Seção de Declarações das variáveis
   contador, num, maior, menor, soma: inteiro
   media: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Informe um número: ")
   leia (num)
   maior <- num
   menor <- num
   soma <- num
   para contador <- 1 ate 9 passo 1 faca
      escreva ("Informe outro número: ")
      leia (num)
      soma <- soma + num
      se (num > maior) entao
         maior <- num
      fimse
      se (num < menor) entao
         menor <- num
      fimse
   fimpara
   media <- soma / 10
   escreval ("SOMA: ", soma)
   escreval ("MÉDIA: ", media)
   escreval ("MAIOR: ", maior)
   escreval ("MENOR: ", menor)

Fimalgoritmo