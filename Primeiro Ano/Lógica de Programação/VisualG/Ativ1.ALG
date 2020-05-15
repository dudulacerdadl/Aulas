Algoritmo "veiculo_e"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/03/2020
Var
   // Seção de Declarações das variáveis
   custotabela, lucro, imposto, perclucro, percimposto, custofinal: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva("Informe o valor tabelado: ")
   leia(custotabela)
   escreva("Informe o percentual de lucro: ")
   leia(perclucro)
   escreva("Informe o percentual de impostos: ")
   leia(percimposto)
   lucro <- custotabela * (perclucro / 100)
   imposto <- custotabela * (percimposto / 100)
   custofinal <- custotabela + lucro + imposto
   escreval("O lucro do distribuidor será de: " , lucro)
   escreval("O valor dos impostos será de: " , imposto)
   escreva("O preço final do veículo é de: " , custofinal)

Fimalgoritmo