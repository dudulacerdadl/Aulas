Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/04/2020
Var
   // Seção de Declarações das variáveis
   pessoa1, pessoa2, vezes, num1, num2, condicao: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   num1 <- randI (1001)
   escreva ("Você consegue adivinhar em qual número eu estou pensando?")
   repita
      vezes <- vezes + 1
      leia (num2)
      se (num2 > num1) entao
         escreval ("Mais alto! Tente outra vez:")
      senao
         escreval ("Mais baixo! Tente outra vez:")
      fimse

   ate (num1 = num2)

   escreva ("Você acertou com ", vezes, " tentativas!")

Fimalgoritmo