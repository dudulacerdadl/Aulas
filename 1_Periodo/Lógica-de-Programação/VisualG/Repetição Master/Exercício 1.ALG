Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 07/05/2020
Var
   // Se��o de Declara��es das vari�veis
   timea, timeb, cond1, cond2, empate: inteiro

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   timea <- 0
   timeb <- 0
   empate <- 0

   repita
      escreval("Escolha uma das op��es a baixo:")
      escreval()
      escreval("[1] Aplicar presquisa.")
      escreval("[2] Mostrar resultado.")
      escreval("[9] Fim.")
      escreval()
      escreva("Digite um n�mero: ")
      leia(cond1)
      escreval()
      se (cond1 = 1) entao
         escreval("Escolha uma das op��es a baixo:")
         escreval()
         escreval("[1] Vencedor: Time A.")
         escreval("[2] Vencedor: Time B.")
         escreval("[3] Empate.")
         escreval("[9] Fim.")
         escreval()
         escreva("Digite um n�mero: ")
         leia(cond2)
         se (cond2 = 1) entao
            escreval()
            escreval("Voc� votou no Time A!")
            escreval()
            timea <- timea + 1
         senao
            se (cond2 = 2) entao
               escreval()
               escreval("Voc� votou no Time B!")
               escreval()
               timeb <- timeb + 1
            senao
               se (cond2 = 3) entao
                  escreval()
                  escreval("Voc� votou por empate!")
                  escreval()
                  empate <- empate + 1
               senao
                  se (cond2 = 9) entao
                  senao
                     escreval()
                     escreval("[ERRO] Digite um n�mero v�lido.")
                     escreval()
                     leia(cond2)
                  fimse
               fimse
            fimse
         fimse

      senao
         se (cond1 = 2) entao
            escreval()
            escreval("O resoltado parcial �: ")
            escreval()
            escreval("Os votos para o Time A est�o em: ", timea)
            escreval("Os votos para o Time B est�o em: ", timeb)
            escreval("Os votos para o Empate est�o em: ", empate)
            escreval()

         senao
            se (cond1 <> 1) e (cond1 <> 2)  e (cond1 <> 9) entao
               enquanto (cond1 <> 1) e (cond1 <> 2)  e (cond1 <> 9) faca
                  escreval("[ERRO] Digite um n�mero v�lido.")
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