Validação de Entrada em Java

Descrição:
Este projeto demonstra a validação de dados de entrada no console utilizando Java. O programa garante que o usuário insira informações válidas antes de prosseguir.

Funcionalidades

O sistema solicita e valida os seguintes dados:

Nome
Não pode ser vazio ou nulo
Idade
Deve ser um número inteiro
Deve estar entre 1 e 120
Valor do Pedido
Deve ser um número decimal (double)
Deve ser maior que zero
Forma de Pagamento
Aceita apenas:
PIX
DINHEIRO
CARTAO
Não diferencia maiúsculas de minúsculas

Regras de Validação
O programa utiliza estruturas de repetição (while) para garantir entradas válidas
Enquanto o dado for inválido, o usuário será solicitado a digitar novamente
Uso de métodos como:
hasNextInt()
hasNextDouble()
equalsIgnoreCase()
trim().isEmpty()

Após todas as validações, o sistema exibe:

Nome
Idade
Valor do pedido (formatado)
Forma de pagamento

E confirma:

Pedido realizado com SUCESSO!

Objetivo

Praticar:

Validação de entrada de dados
Estruturas de repetição
Manipulação de strings
Boas práticas de interação com o usuário no console
