# api-producer

### Configurar arquivo application.yml

**Spring rabbitmq:**
- host -> nome do host
- password -> senha do host
- port -> 5672 valor padrão

**FIAP rabbitmq:**
- exchange -> Utilizar o valor padrão 'fiap.exchange'
- queue -> Nome da fila que sera consumida cloudAMQ
- routingkey -> Chave de roteamento da fila
