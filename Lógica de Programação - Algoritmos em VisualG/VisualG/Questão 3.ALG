Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 06/03/2020
Var
   // Seção de Declarações das variáveis
   valor1: inteiro
   resultado, desconto1: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Valor da compra: ")
   leia (valor1)
   desconto1 <- valor1 * 0.1
   resultado <- valor1 - desconto1
   escreva ("O total de desconto é: " , desconto1)

Fimalgoritmo