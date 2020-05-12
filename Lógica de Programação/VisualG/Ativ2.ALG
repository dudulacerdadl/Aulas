Algoritmo "salarioR"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/03/2020
Var
   // Seção de Declarações das variáveis
   horas, horastrab, salariomin, salariobrut, salariofim, imposto: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Informe o salário mínimo: ")
   leia(salariomin)
   escreva("Informe as horas trabalhadas: ")
   leia(horas)
   horastrab <- salariomin / 2
   salariobrut <- horas * horastrab
   imposto <- salariobrut * (3 / 100)
   salariofim <- salariobrut - imposto
   escreva("O salário líquido é de: " , salariofim)

Fimalgoritmo