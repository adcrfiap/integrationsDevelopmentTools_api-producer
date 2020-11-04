# api-producer

### Configurar arquivo application.yml

**FIAP rabbitmq:**
- exchange -> Utilizar o valor padrão 'fiap.exchange'
- queue -> Nome da fila que sera consumida cloudAMQ
- routingkey -> Chave de roteamento da fila

### CloudAMQConfig.java dentro do pacote config
 
**Dados de conexão do cloudAMQ:**
- Username -> Usuário de conexão
- Password -> senha de conexão
- VirtualHost -> nome do virtual host
