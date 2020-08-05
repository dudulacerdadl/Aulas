Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 28/03/2020
Var
   // Seção de Declarações das variáveis
   codigo: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Insira o código do produto: ")
   leia (codigo)

   escolha (codigo)
   caso (1)
      escreva ("Alimento não-perecível")
   caso (2) ate (4)
      escreva ("Alimento perecível")
   caso (5) ate (6)
      escreva ("Vestuário")
   caso (7)
      escreva ("Higiene pessoal")
   caso (8) ate (15)
      escreva ("Limpeza e utensílios domésticos")
   outrocaso
      escreva ("Inválido!")

   fimescolha

Fimalgoritmo