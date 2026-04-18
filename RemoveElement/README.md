# RemoveElement - Manipulação de Arrays em Java

Este projeto apresenta a resolução de um desafio clássico do LeetCode, focado no gerenciamento eficiente de memória e manipulação de índices em arrays de forma **in-place**.

## O que o projeto faz?
O programa recebe um array de números e um valor específico que deve ser "removido". Sem criar um novo array, ele reorganiza os elementos para que todos os números diferentes do valor escolhido fiquem nas primeiras posições, "limpando" o restante do array.

## Tecnologias e Lógica Aplicada

* **Arrays:** Manipulação direta de estruturas indexadas para armazenamento de dados.
* **While Loop:** Utilizado para percorrer o array de forma controlada através de índices manuais.
* **Lógica de Dois Ponteiros (Two Pointers):** Esta é a "chave" do projeto. Usamos duas variáveis (`i` e `k`):
    * `i`: Atua como o explorador, percorrendo todo o array.
    * `k`: Atua como o marcador de posição "limpa", escrevendo apenas os valores que queremos manter.
* **Eficiência In-place:** A lógica permite modificar o array original sem gastar memória extra criando cópias, o que é uma prática fundamental em sistemas de alta performance.

## Conceitos de Programação
O ponto central do estudo foi a **estratégia de sobrescrita**. Ao invés de realmente "deletar" um item (o que não é possível em arrays fixos de Java), o código move os itens válidos para a frente e ignora os indesejados.

No final, utilizei um segundo loop para preencher as posições restantes com `0`, garantindo uma visualização clara de que os elementos foram "removidos" das posições úteis.

## Como rodar
1.  Certifique-se de ter o JDK instalado.
2.  Compile o arquivo: `javac RemoveElement.java`
3.  Execute: `java RemoveElement`
4.  O console mostrará o array antes e depois da filtragem.
