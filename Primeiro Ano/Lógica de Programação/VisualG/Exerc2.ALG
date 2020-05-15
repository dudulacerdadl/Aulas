Algoritmo "gatos"
// Disciplina   : Lógica de Programação e Algoritimos
// Professor   : Kaneshima
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Eduardo Lacerda
// Data atual  : 19/03/2020
Var
   // Seção de Declarações das variáveis
   saco1, saco2, gato1, gato2, quantidade1, quantidade2, restante: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("De quantos quilos é o saco comprado: ")
   leia (saco1)
   escreva ("Quantos gramas o primeiro gato comerá por dia: ")
   leia (gato1)
   escreva ("Quantas gramas o segundo gato comerá por dia: ")
   leia (gato2)
   saco2 <- saco1 * 1000
   quantidade1 <- gato1 * 5
   quantidade2 <- gato2 * 5
   restante <- (saco2 - (quantidade1 + quantidade2)) / 1000
   escreval("Durante 5 dias, o primeiro gato comerá um total de: " , quantidade1 , "g")
   escreval("Durante 5 dias, o segundo gato comerá um total de: " , quantidade2 , "g")
   escreva("Sobrará dentro do pacote, um total de: " , restante , "Kg")

Fimalgoritmo