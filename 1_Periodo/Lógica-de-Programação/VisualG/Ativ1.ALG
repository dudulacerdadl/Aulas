Algoritmo "veiculo_e"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 20/03/2020
Var
   // Se��o de Declara��es das vari�veis
   custotabela, lucro, imposto, perclucro, percimposto, custofinal: real

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva("Informe o valor tabelado: ")
   leia(custotabela)
   escreva("Informe o percentual de lucro: ")
   leia(perclucro)
   escreva("Informe o percentual de impostos: ")
   leia(percimposto)
   lucro <- custotabela * (perclucro / 100)
   imposto <- custotabela * (percimposto / 100)
   custofinal <- custotabela + lucro + imposto
   escreval("O lucro do distribuidor ser� de: " , lucro)
   escreval("O valor dos impostos ser� de: " , imposto)
   escreva("O pre�o final do ve�culo � de: " , custofinal)

Fimalgoritmo