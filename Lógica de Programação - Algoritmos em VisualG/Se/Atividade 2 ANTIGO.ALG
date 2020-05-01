Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 28/03/2020
Var
   // Seção de Declarações das variáveis
   peso, altura, imc: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Informe sua altura em metros: ")
   leia (altura)
   escreva ("Informe seu peso em kg: ")
   leia (peso)

   imc <- peso / (altura ^ 2)
   escolha (imc)
   caso (0) ate (18.5)
      escreva ("Eu IMC é de: ", imc, " que lhe deixa na categoria: ABAIXO DO PESO")
   caso (18.6) ate (24.9)
      escreva ("Eu IMC é de: ", imc, " que lhe deixa na categoria: PESO NORMAL")
   caso (25) ate (29.9)
      escreva ("Eu IMC é de: ", imc, " que lhe deixa na categoria: SOBREPESO")
   outrocaso
      escreva ("Eu IMC é de: ", imc, " que lhe deixa na categoria: OBESO")
   fimescolha

Fimalgoritmo