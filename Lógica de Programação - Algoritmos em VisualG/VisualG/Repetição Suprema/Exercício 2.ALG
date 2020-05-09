Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 25/04/2020
Var
   // Seção de Declarações das variáveis
   temp: inteiro
   valor_pagar, condicao: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   valor_pagar <- 0

   escreva ("Digite o tempo em minutos: ")
   leia (temp)

   enquanto (temp > -1) faca

      se (temp <= 15) entao
         escreval ("O valor a ser pago é R$", valor_pagar)
      senao
         se (temp <= 60) entao
            valor_pagar <- 1.5
            escreval ("O valor a ser pago é R$", valor_pagar)
         senao
            condicao <- temp / 60
            valor_pagar <- 1.5 + int(condicao)
            escreval ("O valor a ser pago é R$", valor_pagar)
         fimse
      fimse

      escreval ("")
      escreva ("Digite mais um valor: ")
      leia (temp)

   fimenquanto

Fimalgoritmo