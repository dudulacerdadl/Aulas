Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 23/04/2020
Var
   // Seção de Declarações das variáveis
   pessoa1, pessoa2, vezes, num1, num2, num3, condicao: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   num1 <- randI (1001)
   escreva ("Você consegue adivinhar em qual número eu estou pensando?")
   num2 <- randI (1001)
   num3 <- num2
   repita
      vezes <- vezes + 1
      se (num2 > num1) entao
         escreval ("Mais alto! Tente outra vez")
         num3 <- randI (num3 < num2, 1001)
      senao
         escreval ("Mais baixo! Tente outra vez:")
         num3 <- randI (num3 > num2, 1001)
      fimse

   ate (num1 = num2)

   escreva ("Você acertou com ", vezes, " tentativas!")

Fimalgoritmo