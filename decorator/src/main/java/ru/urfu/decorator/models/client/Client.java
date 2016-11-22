package ru.urfu.decorator.models.client;

import java.util.UUID;

import ru.urfu.decorator.models.message.Message;

public class Client implements IClient {

    public Client() {
        super();
    }

    @Override
    public Message getMessage() {
        System.out.println("Получаю сообщение");
        Message message = new Message("author:" + UUID.randomUUID().toString(),
                "receiver:" + UUID.randomUUID().toString(), "text:" + UUID.randomUUID().toString());
        System.out.println(message.toString());
        System.out.println("Получаю сообщение");
        System.out.println("*****");
        return message;

    }

    @Override
    public void sendMessage(Message message) {
        System.out.println("Отправляю сообщение");
        System.out.println(message.toString());
        System.out.println("Отправлено сообщение");
        System.out.println("*****");
    }

}
