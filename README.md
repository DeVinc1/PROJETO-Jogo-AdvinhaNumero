# 🎮PROJETO - Jogo - Adivinhe o Número!
Um jogo de terminal simples onde deve-se adivinhar um número gerado pelo computador a partir de suas características.

## 💽 Tech Stack
  ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)

## 📁 A estrutura do projeto

 - `bin` - pasta com as classes binárias criadas pelo Java;
 - `lib` - contém as bibliotecas utilizadas no projeto;
 - `src` - contém os códigos fontes do projeto;

 
 ## 📜 Descrição
 
Neste jogo simples de terminal, é gerado um número pseudoaleatório o qual deve ser adivinhado pelo usuário em até 5 tentativas. São fornecidos algumas características do número (se é par ou não; se é primo ou não; e seu primeiro múltiplo) para facilitar a adivinhação.

## 📌 Pontos importantes
No arquivo [mathClass.java](https://github.com/DeVinc1/PROJETO-Jogo-AdvinhaNumero/blob/master/src/mathClass.java), o código da linha 5 é responsável por gerar um número aleatório dentro de um intervalo pré-definido, sendo baseado no exemplo:

    Math.random() * (max - min) + min
  Onde:
 - `max` é o valor máximo do intervalo;
 - `min` é o valor mínimo do intervalo.
 
O funcionamento correto dessa operação matemática ocorre em virtude de `Math.random()` gerar um número entre 0 e 1:

    0 * (max - min) + min = min
    1 * (max - min) + min ---> max - min + min = max
