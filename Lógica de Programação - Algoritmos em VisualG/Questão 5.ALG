Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 06/03/2020
Var
   // Seção de Declarações das variáveis
   atual, nascimento, idade1, idade2: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Informe o seu ano de nascimento: ")
   leia (nascimento)
   escreva ("Informe o ano atual: ")
   leia (atual)
   idade1 <- atual - nascimento
   idade2 <- 2030 - nascimento
   escreval ("Sua idade atualmente é: ", idade1)
   escreva ("Sua idade em 2030 será: ", idade2)

Fimalgoritmo