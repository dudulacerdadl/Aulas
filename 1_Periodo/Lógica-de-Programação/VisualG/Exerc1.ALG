Algoritmo "peso_e"
// Disciplina   : L�gica de Programa��o e Algoritimos
// Professor   : Kaneshima
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Eduardo Lacerda
// Data atual  : 19/03/2020
Var
   // Se��o de Declara��es das vari�veis
   peso1, porc1, porc2, pesomagro, pesoengord: real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva ("Informe peso atual: ")
   leia (peso1)
   porc1 <- peso1 * (15/100)
   porc2 <- peso1 * (20/100)
   pesoengord <- peso1 + porc1
   pesomagro <- peso1 - porc2
   escreval ("O peso caso engorde 15% ser� de: " , pesoengord)
   escreva("O peso caso emagre�a 20% ser� de: " , pesomagro)

Fimalgoritmo