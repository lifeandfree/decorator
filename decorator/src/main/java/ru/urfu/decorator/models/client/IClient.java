package ru.urfu.decorator.models.client;

import ru.urfu.decorator.models.message.Message;

public interface IClient {

    Message getMessage();

    void sendMessage(Message message);

}
