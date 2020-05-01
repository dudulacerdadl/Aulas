Algoritmo "simulaCont"
// Disciplina  : Lógica de Programação
// Professor   : Kanehsima
// Descrição   : Simula uma contagem de 10 min até 0.
// Autor(a)    : Eduardo Guimarães de Lacerda Filho
// Data atual  : 25/04/2020
Var
   // Seção de Declarações das variáveis
   min, seg: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreval(" 10:00")
   para min de 9 ate 0 passo -1 faca
      para seg de 59 ate 0 passo -1 faca
         escreval(min,":",seg)
      fimpara
   fimpara


Fimalgoritmo