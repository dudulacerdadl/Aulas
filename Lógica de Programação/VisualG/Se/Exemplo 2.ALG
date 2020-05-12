Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 26/03/2020
Var
   // Seção de Declarações das variáveis
   nome1: caracter
   nota1, nota2, nota3, media: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
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
      escreva ("O aluno foi aprovado com uma média de: ", media)
   senao
      se (media > 40) e (media <70) entao
         escreva ("O aluno ficou de exame com uma média de: ", media)
      senao
         escreva ("O aluno foi reprovado com uma média de: ", media)
      fimse
   fimse

Fimalgoritmo