Algoritmo "salarioR"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/03/2020
Var
   // Se��o de Declara��es das vari�veis
   horas, horastrab, salariomin, salariobrut, salariofim, imposto: real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva("Informe o sal�rio m�nimo: ")
   leia(salariomin)
   escreva("Informe as horas trabalhadas: ")
   leia(horas)
   horastrab <- salariomin / 2
   salariobrut <- horas * horastrab
   imposto <- salariobrut * (3 / 100)
   salariofim <- salariobrut - imposto
   escreva("O sal�rio l�quido � de: " , salariofim)

Fimalgoritmo