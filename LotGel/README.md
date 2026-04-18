# LotGel - Sistema de Combate em Java

Este projeto simula a lógica de turnos de batalha inspirada no universo de **Hollow Knight**, focado em praticar lógica de programação e Programação Orientada a Objetos (POO).

## O que o projeto faz?
O programa realiza um embate entre o Knight e um inimigo. Em cada turno, o sistema sorteia valores de ataque para ambos. Se o Knight vencer o turno, ele acumula Geo (moeda do jogo).

## Tecnologias e Lógica Aplicada
- **ArrayList:** Utilizado para criar "pools" (conjuntos) de valores de ataque fixos para os personagens.
- **Random:** Utilizado para sortear o índice dentro dessas listas, simulando a variabilidade de um golpe no combate.
- **Scanner:** Permite a interação do usuário para decidir se deseja continuar lutando.
- **While Loop:** Mantém o ciclo de combate ativo enquanto o usuário desejar.

## Conceitos de POO
O ponto central do estudo foi o uso da palavra-chave `this`. 
No método construtor e no método `kill`, utilizei `this.balance` para garantir que a manipulação do saldo de Geo fosse feita diretamente no atributo da instância do objeto `knight`, evitando conflitos com variáveis locais.

## Como rodar
1. Certifique-se de ter o Java instalado.
2. Execute o arquivo `LotGel.java`.
3. Digite 'yes' para iniciar o combate!
