Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/03/2020
Var
   // Seção de Declarações das variáveis
   media: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Escreva sua média: ")
   leia (media)

   se (media >= 0) e (media <2) entao
      escreva ("Sua média de ", media, " é considerada PÉSSIMA")
   senao
      se (media >= 2) e (media <4) entao
         escreva ("Sua média de ", media, " é considerada RUIM")
      senao
         se (media >= 4) e (media <6) entao
            escreva ("Sua média de ", media, " é considerada INSUFICIENTE")
         senao
            se (media >= 6) e (media <7) entao
               escreva ("Sua média de ", media, " é considerada SUFICIENTE")
            senao
               se (media >= 7) e (media <8.5) entao
                  escreva ("Sua média de ", media, " é considerada BOA")
               senao
                  se (media >= 8.5) e (media <10) entao
                     escreva ("Sua média de ", media, " é considerada EXCELENTE")
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse

Fimalgoritmo