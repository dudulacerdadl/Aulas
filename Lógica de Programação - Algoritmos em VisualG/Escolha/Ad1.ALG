Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 28/03/2020
Var
   // Seção de Declarações das variáveis
   nome: caracter
   nota1, nota2, nota3, media: real
   p1, p2, p3: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Digite seu nome: ")
   leia (nome)
   escreva ("Sua primeira nota: ")
   leia (nota1)
   escreva ("sua segunda nota: ")
   leia (nota2)
   escreva ("Sua terceira nota: ")
   leia (nota3)
   escreva ("Valor dos pesos: ")
   leia (p1)
   leia (p2)
   leia (p3)

   media <- (p1 * nota1 + p2 * nota2 + p3 * nota3) / (p1 + p2 + p3)

   escolha (media)
   caso (0.0) ate (4.9)
      escreva ("O aluno ", nome, " foi REPROVADO, com conceito E, e média de: ", media)
   caso (5) ate (5.9)
      escreva ("O aluno ", nome, " foi REPROVADO, com conceito D, e média de: ", media)
   caso (6) ate (7.4)
      escreva ("O aluno ", nome, " foi APROVADO, com conceito C, e média de: ", media)
   caso (7.5) ate (8.9)
      escreva ("O aluno ", nome, " foi APROVADO, com conceito B, e média de: ", media)
   caso (9) ate (10)
      escreva ("O aluno ", nome, " foi APROVADO, com conceito A, e média de: ", media)

   fimescolha
Fimalgoritmo