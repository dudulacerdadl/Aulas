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
   se (imc < 18.5) entao
      escreva ("Eu IMC é de: ", imc, " que lhe deixa na categoria: ABAIXO DO PESO")
   senao
   se (imc > 18.6) e (imc < 24.9) entao
      escreva ("Eu IMC é de: ", imc, " que lhe deixa na categoria: PESO NORMAL")
   senao
   se (imc > 25) e (imc < 29.9) entao
      escreva ("Eu IMC é de: ", imc, " que lhe deixa na categoria: SOBREPESO")
   senao
      escreva ("Eu IMC é de: ", imc, " que lhe deixa na categoria: OBESO")
   fimse
   fimse
   fimse

Fimalgoritmo