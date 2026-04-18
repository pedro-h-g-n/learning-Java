# DollarConverter - Conversor de Moedas em Java

Este projeto é uma ferramenta de console simples para conversão de moedas (Real para Dólar ou Euro), focada em praticar entrada de dados e formatação de saída.

## O que o projeto faz?
O programa solicita que o usuário escolha entre duas moedas estrangeiras e insira um valor em Reais (BRL). Com base na cotação definida no código, ele calcula e exibe o valor convertido com duas casas decimais.

## Tecnologias e Lógica Aplicada

* **Scanner:** Utilizado para capturar a escolha do menu e o valor monetário digitado pelo usuário.
* **Estrutura Condicional (if/else if):** Define qual cálculo de conversão será aplicado com base na opção selecionada (1 para USD, 2 para EUR).
* **System.out.printf:** O destaque técnico aqui é o uso de formatação de strings. O uso de `%.2f` garante que o resultado financeiro seja exibido com apenas dois dígitos após a vírgula, seguindo o padrão monetário.
* **Gerenciamento de Recursos:** Uso do método `choiceAndBrl.close()` para encerrar o Scanner, uma boa prática em Java para evitar vazamento de memória (resource leak).

## Como rodar
1.  Compile o arquivo: `javac DollarConverter.java`
2.  Execute: `java DollarConverter`
3.  Siga as instruções no console para escolher a moeda e digitar o valor.
