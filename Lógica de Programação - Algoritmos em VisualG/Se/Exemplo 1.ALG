Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 26/03/2020
Var
   // Seção de Declarações das variáveis
   produto1, produto2, desconto1, valortotal: real
   nome1, nome2: caracter

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Nome do primero produto: ")
   leia (nome1)
   escreva ("Seu valor: ")
   leia (produto1)
   escreva ("Nome do primero produto: ")
   leia (nome2)
   escreva ("Seu valor: ")
   leia (produto2)

   desconto1 <- (produto1 + produto2) * (20 / 100)
   valortotal <- produto1 + produto2
   se (valortotal > 100) entao
      valortotal <- valortotal - desconto1
   fimse

   escreva ("O valor de ", nome1, " e de ", nome2, " é de R$", valortotal)

Fimalgoritmo