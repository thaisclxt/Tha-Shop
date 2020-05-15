# ThaíShop

## Classes

- [X] Proprietario
  - [X] Atributos
  - [X] Métodos
    - [X] Login
    - [X] Tela para manutenção do mercado
    - [X] Carregar uma lista padrão de itens
    - [X] Adicionar itens à venda
    - [X] Remover itens à venda
    - [X] Exibir itens à venda
    - [X] Ajustar todos os dados do item
- [X] Item
  - [X] Atributos
    - [X] Nome do produto
    - [X] Código do produto
    - [X] Valor do produto
  - [X] Métodos
    - [X] Imprimir dados dos itens
    - [X] Ajustar todos os dados do item
- [X] Mercado
  - [X] Atributos
    - [X] Lista de itens
  - [X] Métodos
    - [X] Adicionar itens no mercado
    - [X] Listar itens do mercado
    - [X] Remover itens do mercado
- [X] Cliente
  - [X] Atributos
    - [X] Recipiente
  - [X] Login
  - [X] Escolher recipiente
  - [X] Adicionar itens no recipiente
  - [X] Remover itens do recipiente
  - [X] Trocar recipiente
  - [X] Prever custo total
  - [X] Opção secreta: Roubar
- [X] Recipiente
  - [X] Atributos
    - [X] Lista de recipientes
    - [X] Tamanho
  - [X] Métodos
    - [X] Adicionar no recipiente
    - [X] Mostrar itens do recipiente
- [X] Caixa
  - [X] Atributos
    - [X] Lista do caixa
  - [X] Métodos
    - [X] Login
    - [X] Tela para o caixa 
    - [X] Adicionar itens no caixa
      - [X] Adicionar todos os itens do cliente
      - [X] Adicionar itens individualmente
    - [X] Remover itens do caixa
      - [X] Remover tudo
      - [X] Remover individualmente
    - [X] Pagar
    - [X] Total
    - [X] Concluir comprar
    - [X] Receber quantia paga
    - [X] Notas e moedas
    - [X] Cancelar compra


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
    - [X] Colocar itens no "recipiente"
    - [X] Remover itens
    - [X] Ver todos os itens atuais
    - [X] Trocar "recipiente"
    - [X] Prever custo total
    - [X] Cancelar compra
    - [X] Confirmar compra
    - [X] *Opção secreta: Roubar*
  - [X] Tela para o Caixa
    - [X] Exibição do total
    - [X] Exibição da lista de compras do cliente
    - [X] Adicionar itens
      - [X] Adicionar todos os itens do cliente
      - [X] Adicionar itens individualmente
    - [X] Remover itens
      - [X] Remover tudo
      - [X] Remover individualmente
    - [X] Cancelar compra
    - [X] Receber a quantia paga pelo cliente
    - [X] Exibir como retornar o troco, em notas e moedas
    - [X] Concluir compra

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