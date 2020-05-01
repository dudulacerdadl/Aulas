Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 28/03/2020
Var
   // Seção de Declarações das variáveis
   nome: caracter
   depend: inteiro
   salb, sall1, sall2, impost1, impost2: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Informe seu nome: ")
   leia (nome)
   escreva ("Infome a renda bruta anual: ")
   leia (salb)
   escreva ("Número de dependentes: ")
   leia (depend)

   sall1 <- salb - (depend * 600)
   se (sall1 > 10000) entao
      impost1 <- 0
   senao
      se (sall1 < 10000.01) e (sall1 > 30000) entao
         impost1 <- 5 / 100
      senao
         se (sall1 < 30000.01) e (sall1 > 60000) entao
            impost1 <- 10 / 100
         senao
            impost1 <- 15 / 100
         fimse
      fimse
   fimse


   impost2 <- sall1 * impost1
   sall2 <- sall1 - impost2

   escreva (nome, " obteve uma Renda Líquida de R$", sall2, " com um imposto de R$", impost2)

Fimalgoritmo