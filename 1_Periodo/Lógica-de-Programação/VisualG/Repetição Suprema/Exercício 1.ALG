Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 25/04/2020
Var
   // Seção de Declarações das variáveis
   time, jog, num_equipes, jogador, jog_altura, qtd_menos_18, qtd_mais_80: inteiro
   idade, peso, altura, soma_idade, media_idade, soma_altura, media_altura: real

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   qtd_menos_18 <- 0
   qtd_mais_80 <- 0
   soma_altura <- 0
   jog_altura <- 0

   para time de 1 ate 5 faca
      escreval ("Número de jogadores que terão em sua equipe: ")
      leia (jog)
      soma_idade <- 0
      para jogador de 1 ate jog faca
         escreval("Informe a idade do jogador ", jogador, " do time ", time, ":")
         leia (idade)
         soma_idade <- soma_idade + idade
         escreval("Informe o peso do jogador ", jogador, ":")
         leia (peso)
         escreval("Informe a altura do jogador ", jogador, ":")
         leia (altura)
         jog_altura <- jog_altura + 1
         se (idade < 18) entao
            qtd_menos_18 <- qtd_menos_18 + 1
         fimse
         soma_altura <- soma_altura + altura
         se (peso > 80) entao
            qtd_mais_80 <- qtd_mais_80 + 1
         fimse

      fimpara

      media_idade <- soma_idade / jog
      escreval ("Média de idade dos jogadores do time ", time, " é de: ", media_idade)
   fimpara
   media_altura <- soma_altura / jog_altura
   escreval ("A quantidade de jogadores com idade inferior a 18 anos: ", qtd_menos_18)
   escreval ("A média das alturas de todos os jogadores do campeonato: ", media_altura)
   escreval ("A quantidade de jogadores com mais de 80 quilos entre todos os jogadores do campeonato é de: ", qtd_mais_80)

Fimalgoritmo