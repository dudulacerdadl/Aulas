Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 28/03/2020
Var
   // Seção de Declarações das variáveis
   area, custo: real
   tipe: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Infome a área de pulverização: ")
   leia (area)
   escreval
   escreval ("Tipo 1: Pulverização contra ervas daninhas, custo de R$0,50 por área")
   escreval ("Tipo 2: Pulverização contra gafanhotos, custo de R$1,00 por área")
   escreval ("Tipo 3: Pulverização contra broca, custo de R$1,50 por área")
   escreval ("Tipo 4: Pulverização contra os tipos 01, 02 e 03, custo de R$2,50 por área")
   escreval
   escreval ("Informe o número do tipo de pulverização: ")
   leia (tipe)

   escolha (tipe)
   caso (1)
      custo <- area * 0.5
   caso (2)
      custo <- area * 1
   caso (3)
      custo <- area * 1.5
   caso (4)
      custo <- area * 2.5
   outrocaso
      escreva ("Inválido")
   fimescolha

   escreva ("Seu custo será de: ", custo)

Fimalgoritmo