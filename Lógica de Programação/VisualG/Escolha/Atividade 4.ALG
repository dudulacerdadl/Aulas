Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 28/03/2020
Var
   // Seção de Declarações das variáveis
   nome: caracter
   mes: inteiro
   valor, prob1, prob2: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Digite o seu nome: ")
   leia (nome)
   escreva ("Digite o valor da compra: ")
   leia (valor)
   escreva ("Digite o número do mês de seu aniversário: ")
   leia (mes)

   prob1 <- valor / 2
   prob2 <- valor / 3

   se (mes > 12) entao
      escreva ("Inválido")
   senao
      se (valor < 699) entao
         escreva ("A compra do cliente ", nome, " no valor de ", valor, " não será possível ser feito parcelamento")
      senao
         se (mes > 6) entao
            se (mes = 7) ou (mes = 9) ou (mes = 11) entao
               escreva ("A compra do cliente ", nome, " no valor de ", valor, " poderá parcelar em 2x de ", prob1)
            senao
               escreva ("A compra do cliente ", nome, " no valor de ", valor, " poderá parcelar em 3x de ", prob2)
            fimse
         senao
            se (mes = 1) ou (mes = 3) ou (mes = 5) entao
               escreva ("A compra do cliente ", nome, " no valor de ", valor, " poderá parcelar em 3x de ", prob2)
            senao
               escreva ("A compra do cliente ", nome, " no valor de ", valor, " poderá parcelar em 2x de ", prob1)
            fimse
         fimse
      fimse
   fimse

Fimalgoritmo