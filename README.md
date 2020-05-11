# ThaíShop

## Classes

- [X] Item
  - [X] Atributos
    - [X] Nome do produto
    - [X] Código do produto
    - [X] Valor do produto
- [X] Recipientes
  - [X] Atributos
    - [X] Carrinho grande
    - [X] Carrinho pequeno
    - [X] Cesta
  - [ ] Métodos
    - [ ] Adição de itens no recipiente
    - [ ] Remoção de itens
    - [ ] Exibição de itens
    - [ ] Trocar recipiente
    - [ ] Prever custo total
    - [ ] Cancelar compra
    - [ ] Confirmar compra
    - [ ] Opção secreta: Roubar

## Objetivo

Criar um programa pra simular um mercado.

- O programa precisa ter:
  - [X] Tela para manutenção do mercado
    - [X] Adição de itens à venda
    - [X] Remoção de itens à venda
    - [X] Exibir itens que estão à venda
    - [X] Carregar uma lista padrão de itens
    - [X] Ajuste de todos os dados do item
    - [X] Concluir ajustes
  - [X] Tela para o cliente
    - [ ] Colocar itens no "recipiente"
    - [ ] Remover itens
    - [ ] Ver todos os itens atuais
    - [ ] Trocar "recipiente"
    - [ ] Prever custo total
    - [ ] Cancelar compra
    - [ ] Confirmar compra
    - [ ] *Opção secreta: Roubar*
  - [X] Tela para o Caixa
    - [ ] Exibição do total
    - [ ] Exibição da lista de compras do cliente
    - [ ] Adicionar itens
      - [ ] Adicionar todos os itens do cliente
      - [ ] Adicionar itens individualmente
    - [ ] Remover itens
      - [ ] Remover tudo
      - [ ] Remover individualmente
    - [ ] Cancelar compra
    - [ ] Receber a quantia paga pelo cliente
    - [ ] Exibir como retornar o troco, em notas e moedas
    - [ ] Concluir compra

### Observações

- "recipiente" é onde ficam os itens do cliente, você fará três opções:
  - Carrinho grande
    - Cabem 60 itens.
  - Carrinho pequeno
    - Cabem 35 itens.
  - Cesta
    - Cabem 20 itens.
- Roubar
  - O cliente que optar por roubar vai ter uma chance de 1 em (2 ^ quantidade_de_itens) de realizar o furto com sucesso.
- Item
  - Cada produto precisa ter, pelo menos, os seguintes dados:
    - Nome do produto
    - Código do produto
    - Valor do produto

### Dicas

- Você pode fazer os recipientes usando herança.
- ArrayList pode ser bem útil pra fazer as listas de itens.
- Crie a lista de itens padrão logo quando estiver começando o programa, pra não ter que inserir todos os itens manualmente sempre que for testar.