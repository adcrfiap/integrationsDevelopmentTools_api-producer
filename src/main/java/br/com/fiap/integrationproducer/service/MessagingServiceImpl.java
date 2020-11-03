package br.com.fiap.integrationproducer.service;

import br.com.fiap.integrationproducer.config.rabbitmq.CloudAMQConfig;
import br.com.fiap.integrationproducer.model.Message;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessagingServiceImpl implements MessagingService {

    @Value("${fiap.rabbitmq.exchange}")
    private String exchange;

    @Value("${fiap.rabbitmq.routingkey}")
    private String routingKey;

    private static AmqpTemplate rabbitTemplate;

    public MessagingServiceImpl(AmqpTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void send(Message message) {
        String mensagem;
        long temperatura = message.getTemperatura();;
        long humidade = message.getHumidade();


        if ( ( temperatura >= 35 || temperatura <=0 ) ||
                ( humidade <= 15 ) ) {

            mensagem = "Id Drone: " + message.getIdDrone() +
                       " temperatura: " + message.getTemperatura() + "°C" +
                       " humidade: " + message.getHumidade();

            this.rabbitTemplate = new RabbitTemplate(CloudAMQConfig.getConnection());
            this.rabbitTemplate.convertAndSend(this.exchange, this.routingKey, mensagem);

        }

    }

}
