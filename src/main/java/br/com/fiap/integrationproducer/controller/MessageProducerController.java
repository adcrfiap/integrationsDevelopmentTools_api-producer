package br.com.fiap.integrationproducer.controller;

import br.com.fiap.integrationproducer.model.Message;
import br.com.fiap.integrationproducer.service.MessagingService;
import br.com.fiap.integrationproducer.service.MessagingServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/drone/add")
public class MessageProducerController {

    private final MessagingServiceImpl messagingService;

    public MessageProducerController(MessagingServiceImpl messagingService) {
        this.messagingService = messagingService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void send(@RequestBody Message message) {
        this.messagingService.send(message);
    }

}
