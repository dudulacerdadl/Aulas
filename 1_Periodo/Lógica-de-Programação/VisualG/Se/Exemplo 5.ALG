Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 27/03/2020
Var
   // Se��o de Declara��es das vari�veis
   media: real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva ("Escreva sua m�dia: ")
   leia (media)

   se (media >= 0) e (media <2) entao
      escreva ("Sua m�dia de ", media, " � considerada P�SSIMA")
   senao
      se (media >= 2) e (media <4) entao
         escreva ("Sua m�dia de ", media, " � considerada RUIM")
      senao
         se (media >= 4) e (media <6) entao
            escreva ("Sua m�dia de ", media, " � considerada INSUFICIENTE")
         senao
            se (media >= 6) e (media <7) entao
               escreva ("Sua m�dia de ", media, " � considerada SUFICIENTE")
            senao
               se (media >= 7) e (media <8.5) entao
                  escreva ("Sua m�dia de ", media, " � considerada BOA")
               senao
                  se (media >= 8.5) e (media <10) entao
                     escreva ("Sua m�dia de ", media, " � considerada EXCELENTE")
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse

Fimalgoritmo