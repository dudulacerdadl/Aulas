Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 26/03/2020
Var
   // Se��o de Declara��es das vari�veis
   nome1: caracter
   nota1, nota2, nota3, media: real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva ("Nome da diciplina: ")
   leia (nome1)
   escreva ("Sua primeria nota: ")
   leia (nota1)
   escreva ("Sua segunda nota: ")
   leia (nota2)
   escreva ("Sua terceira nota: ")
   leia (nota3)

   media <- (nota1 + nota2 + nota3) / 3
   se (media >= 70) entao
      escreva ("O aluno foi aprovado com uma m�dia de: ", media)
   senao
      se (media > 40) e (media <70) entao
         escreva ("O aluno ficou de exame com uma m�dia de: ", media)
      senao
         escreva ("O aluno foi reprovado com uma m�dia de: ", media)
      fimse
   fimse

Fimalgoritmo