Algoritmo "semnome"
// Disciplina   : [Linguagem e L�gica de Programa��o]
// Professor   : Antonio Carlos Nicolodi
// Descri��o   : Aqui voc� descreve o que o programa faz! (fun��o)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 28/03/2020
Var
   // Se��o de Declara��es das vari�veis
   faltas: inteiro
   prova, trab, media: real
   nomealuno, nomediciplina: caracter

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   escreva ("Insira o nome do aluno: ")
   leia (nomealuno)
   escreva ("Nome da diciplina: ")
   leia (nomediciplina)
   escreva ("N�mero de faltas: ")
   leia (faltas)
   escreva ("Nota da prova: ")
   leia (prova)
   escreva ("Nota do trabalho: ")
   leia (trab)

   media <- (prova * 70 + trab * 30) / 100

   se (faltas > 18) entao
      escreva ("O aluno ", nomealuno, " com m�dia ", media, " na diciplina ", nomediciplina, " foi REPROVADO por falta")
   senao
      se (media >= 30) e (media < 69) entao
         escreva ("O aluno ", nomealuno, " com m�dia ", media, " na diciplina ", nomediciplina, " ficou de EXAME")
      senao
         se (media >= 70) e (media < 100) entao
            escreva ("O aluno ", nomealuno, " com m�dia ", media, " na diciplina ", nomediciplina, " foi APROVADO")
         senao
            escreva ("O aluno ", nomealuno, " com m�dia ", media, " na diciplina ", nomediciplina,  " foi REPROVADO")
         fimse
      fimse
   fimse

Fimalgoritmo