# Roman to Integer - Conversor de Números Romanos em Java

Este projeto resolve o desafio de converter uma `String` contendo algarismos romanos para o seu valor correspondente em números inteiros.

## O que o projeto faz?
O programa percorre cada caractere da String romana e soma os valores correspondentes. Ele implementa a regra especial da numeração romana: se um número menor vem antes de um maior (ex: IV), ele deve ser subtraído em vez de somado.

## Tecnologias e Lógica Aplicada

* **Switch Case:** Utilizado no método auxiliar `RomanValue` para mapear cada caractere ('I', 'V', 'X', etc.) ao seu respectivo valor numérico.
* **Manipulação de Strings:** Uso do método `take.charAt(e)` para acessar cada símbolo individualmente através do índice.
* **Lógica de Comparação:** * O programa olha para o valor atual (`current`) e para o próximo (`next`).
    * Se `current < next`, o valor é subtraído do total (Ex: no 'IV', o 1 é subtraído antes do 5 ser somado, resultando em 4).
    * Caso contrário, o valor é somado normalmente.
* **Prevenção de Erros (Index Out of Bounds):** Implementação de uma verificação `if(e + 1 < take.length())` para garantir que o programa não tente ler um "próximo" caractere que não existe no final da String.

## Como rodar
1.  Compile o arquivo: `javac Roman.java`
2.  Execute: `java Roman`
3.  Saída esperada para "XLVII": `The result is: 47`
