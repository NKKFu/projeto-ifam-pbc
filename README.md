# Projeto Baseado em Componentes – PBC

## F.A.Q.

 - Por que separar validação de CPF e emails em arquivos separados das validações de nomes e endereços por exemplo?
 > Há uma padronização no formato de CPFs e Emails em todo o território nacional, o mesmo não ocorre com Nomes e Endereços.

## Requisitos

Prática de Reúso de Funções e Procedimentos.

Faça um programa em Java (CLI : Command-line Interface, modo texto) para realizar um cadastro de clientes de uma loja, incluindo os seus dependentes.
Os dados devem ser armazenados apenas em memória, e você pode usar estruturas de dados como: arrays ou Lists (java.collections).

Dados do Cliente:
1. Nome
2. Endereço
3. Telefone
4. E-mail
5. CPF

Dados do Dependente do Cliente:
1. Nome
2. Endereço
3. Telefone
4. E-mail
5. CPF
6. Relação: Cônjuge, Pai, Mãe, Filho e Enteado.

Você deve modelar os dados em classes de entidade, de modo que evite a redundância na definição de dados e facilite a manutenção do código-fonte.
Os dados de entrada devem ser validados antes de serem armazenados, para isso, faça a validação usando métodos.
Identifique os blocos de código-fonte que se repetem e crie métodos que possam ser reutilizados.
Ao final deste exercício, você deve implementar:
1. Classes View (UI - User Interface)
2. Classe Controller
3. Classes Model
4. Bibliotecas de Funções
