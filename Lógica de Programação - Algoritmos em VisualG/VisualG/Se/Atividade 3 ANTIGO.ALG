Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 28/03/2020
Var
   // Seção de Declarações das variáveis
   faltas: inteiro
   prova, trab, media: real
   nomealuno, nomediciplina: caracter

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   escreva ("Insira o nome do aluno: ")
   leia (nomealuno)
   escreva ("Nome da diciplina: ")
   leia (nomediciplina)
   escreva ("Número de faltas: ")
   leia (faltas)
   escreva ("Nota da prova: ")
   leia (prova)
   escreva ("Nota do trabalho: ")
   leia (trab)

   media <- (prova * 70 + trab * 30) / 100

   se (faltas > 18) entao
      escreva ("O aluno ", nomealuno, " com média ", media, " na diciplina ", nomediciplina, " foi REPROVADO por falta")
   senao
      escolha (media)
      caso (30) ate (69)
         escreva ("O aluno ", nomealuno, " com média ", media, " na diciplina ", nomediciplina, " ficou de EXAME")
      caso (70) ate (100)
         escreva ("O aluno ", nomealuno, " com média ", media, " na diciplina ", nomediciplina, " foi APROVADO")
      outrocaso
         escreva ("O aluno ", nomealuno, " com média ", media, " na diciplina ", nomediciplina,  " foi REPROVADO")
      fimescolha
   fimse

Fimalgoritmo