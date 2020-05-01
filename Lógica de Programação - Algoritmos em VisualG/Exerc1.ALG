Algoritmo "peso_e"
// Disciplina   : Lógica de Programação e Algoritimos
// Professor   : Kaneshima
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Eduardo Lacerda
// Data atual  : 19/03/2020
Var
   // Seção de Declarações das variáveis
   peso1, porc1, porc2, pesomagro, pesoengord: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Informe peso atual: ")
   leia (peso1)
   porc1 <- peso1 * (15/100)
   porc2 <- peso1 * (20/100)
   pesoengord <- peso1 + porc1
   pesomagro <- peso1 - porc2
   escreval ("O peso caso engorde 15% será de: " , pesoengord)
   escreva("O peso caso emagreça 20% será de: " , pesomagro)

Fimalgoritmo