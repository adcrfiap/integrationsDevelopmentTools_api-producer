package br.com.fiap.integrationproducer.service;

import br.com.fiap.integrationproducer.model.Message;

public interface MessagingService {

    void send(Message message);

}
