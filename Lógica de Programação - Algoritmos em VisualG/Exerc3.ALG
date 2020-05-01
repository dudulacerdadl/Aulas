Algoritmo "troca_var"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 19/03/2020
Var
   // Seção de Declarações das variáveis
   valor1, valor2, intermed: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Dê o valor de A: ")
   leia(valor1)
   intermed <- valor1
   valor2 <- 20 * 1
   valor1 <- valor2
   valor2 <- intermed
   escreval("O valor de A é: " , valor1)
   escreva("O valor de B é: " , valor2)

Fimalgoritmo