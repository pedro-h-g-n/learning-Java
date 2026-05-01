# Palindrome Number - Lógica Matemática em Java

Este projeto resolve o desafio de verificar se um número inteiro é um palíndromo (se lê da mesma forma de trás para frente) utilizando apenas operações aritméticas.

## O que o projeto faz?
O programa recebe um número inteiro e inverte seus dígitos matematicamente. Ao final, ele compara o número invertido com o original para determinar se ele é um palíndromo.

## Tecnologias e Lógica Aplicada

* **Operadores Aritméticos:** * `% 10`: Utilizado para extrair o último dígito do número.
    * `/ 10`: Utilizado para remover o último dígito e avançar na lógica.
* **While Loop:** Garante que o processo de inversão continue enquanto ainda houver dígitos a serem processados (`number > 0`).
* **Lógica de Inversão:** * A variável `invertedNumber` é multiplicada por 10 a cada ciclo para "abrir espaço" para o novo dígito que foi extraído.

## Conceitos de Programação
O destaque deste estudo é a **manipulação de variáveis sem auxílio de métodos prontos**. Ao invés de converter o número para `String` e usar o método `reverse()`, a solução foca em lógica pura, o que é muito mais eficiente em termos de processamento e memória.

## Como rodar
1.  Compile o arquivo: `javac Palindrome.java`
2.  Execute: `java Palindrome`
3.  O resultado no console será: `121 is a palindrome number!` (ou a mensagem correspondente ao número testado).
