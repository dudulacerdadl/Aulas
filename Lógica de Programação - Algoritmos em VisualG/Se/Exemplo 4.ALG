Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 26/03/2020
Var
   // Seção de Declarações das variáveis
   valor1, valor2, valor3: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Primeiro valor: ")
   leia (valor1)
   escreva ("Segundo valor: ")
   leia (valor2)
   escreva ("Terceiro valor: ")
   leia (valor3)

   se (valor1 < valor2) e (valor2 < valor3) entao
      escreval (valor1)
      escreval (valor2)
      escreva (valor3)
   senao
      se (valor2 < valor1) e (valor1 < valor3) entao
         escreval (valor2)
         escreval (valor1)
         escreva (valor3)
      senao
         se (valor3 < valor1) e (valor1 < valor2) entao
            escreval (valor3)
            escreval (valor1)
            escreva (valor2)
         senao
            se (valor3 < valor2) e (valor2 < valor1) entao
               escreval (valor3)
               escreval (valor2)
               escreva (valor1)
            senao
               se (valor1 < valor3) e (valor3 < valor2) entao
                  escreval (valor1)
                  escreval (valor3)
                  escreva (valor2)
               senao
                  se (valor2 < valor3) e (valor3 < valor1) entao
                     escreval (valor2)
                     escreval (valor3)
                     escreva (valor1)
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse

Fimalgoritmo