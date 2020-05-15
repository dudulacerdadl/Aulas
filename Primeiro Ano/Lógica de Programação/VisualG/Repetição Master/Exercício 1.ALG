Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/05/2020
Var
   // Seção de Declarações das variáveis
   timea, timeb, cond1, cond2, empate: inteiro

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   timea <- 0
   timeb <- 0
   empate <- 0

   repita
      escreval("Escolha uma das opções a baixo:")
      escreval()
      escreval("[1] Aplicar presquisa.")
      escreval("[2] Mostrar resultado.")
      escreval("[9] Fim.")
      escreval()
      escreva("Digite um número: ")
      leia(cond1)
      escreval()
      se (cond1 = 1) entao
         escreval("Escolha uma das opções a baixo:")
         escreval()
         escreval("[1] Vencedor: Time A.")
         escreval("[2] Vencedor: Time B.")
         escreval("[3] Empate.")
         escreval("[9] Fim.")
         escreval()
         escreva("Digite um número: ")
         leia(cond2)
         se (cond2 = 1) entao
            escreval()
            escreval("Você votou no Time A!")
            escreval()
            timea <- timea + 1
         senao
            se (cond2 = 2) entao
               escreval()
               escreval("Você votou no Time B!")
               escreval()
               timeb <- timeb + 1
            senao
               se (cond2 = 3) entao
                  escreval()
                  escreval("Você votou por empate!")
                  escreval()
                  empate <- empate + 1
               senao
                  se (cond2 = 9) entao
                  senao
                     escreval()
                     escreval("[ERRO] Digite um número válido.")
                     escreval()
                     leia(cond2)
                  fimse
               fimse
            fimse
         fimse

      senao
         se (cond1 = 2) entao
            escreval()
            escreval("O resoltado parcial é: ")
            escreval()
            escreval("Os votos para o Time A estão em: ", timea)
            escreval("Os votos para o Time B estão em: ", timeb)
            escreval("Os votos para o Empate estão em: ", empate)
            escreval()

         senao
            se (cond1 <> 1) e (cond1 <> 2)  e (cond1 <> 9) entao
               enquanto (cond1 <> 1) e (cond1 <> 2)  e (cond1 <> 9) faca
                  escreval("[ERRO] Digite um número válido.")
                  leia(cond1)
               fimenquanto
            fimse
         fimse
      fimse

   ate (cond1 = 9)

   escreval()
   escreval("O resoltado final foi: ")
   escreval()
   escreval("Os votos para o Time A terminaram em: ", timea)
   escreval("Os votos para o Time B terminaram em: ", timeb)
   escreval("Os votos para o Empate terminaram em: ", empate)

Fimalgoritmo