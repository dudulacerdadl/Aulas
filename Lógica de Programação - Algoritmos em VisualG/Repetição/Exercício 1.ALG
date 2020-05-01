Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 11/04/2020
Var
   // Seção de Declarações das variáveis
   contador, limite, soma: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Valor máximo: ")
   leia (limite)
   para contador <- 1 ate limite passo 1 faca
      se (contador < limite) e (contador %2 = 0) entao

         soma <- soma + contador

      fimse
   fimpara
   escreva ("A soma dos números pares é de: ", soma)

Fimalgoritmo