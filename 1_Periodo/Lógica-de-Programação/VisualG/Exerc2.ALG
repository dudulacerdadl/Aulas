Algoritmo "gatos"
// Disciplina   : L�gica de Programa��o e Algoritimos
// Professor   : Kaneshima
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Eduardo Lacerda
// Data atual  : 19/03/2020
Var
   // Se��o de Declara��es das vari�veis
   saco1, saco2, gato1, gato2, quantidade1, quantidade2, restante: real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva("De quantos quilos � o saco comprado: ")
   leia (saco1)
   escreva ("Quantos gramas o primeiro gato comer� por dia: ")
   leia (gato1)
   escreva ("Quantas gramas o segundo gato comer� por dia: ")
   leia (gato2)
   saco2 <- saco1 * 1000
   quantidade1 <- gato1 * 5
   quantidade2 <- gato2 * 5
   restante <- (saco2 - (quantidade1 + quantidade2)) / 1000
   escreval("Durante 5 dias, o primeiro gato comer� um total de: " , quantidade1 , "g")
   escreval("Durante 5 dias, o segundo gato comer� um total de: " , quantidade2 , "g")
   escreva("Sobrar� dentro do pacote, um total de: " , restante , "Kg")

Fimalgoritmo