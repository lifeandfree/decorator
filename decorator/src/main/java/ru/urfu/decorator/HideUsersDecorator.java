/**
 * @author lifeandfree
 *         Пакет: ru.urfu.decorator
 *         Дата создания класса: 22 нояб. 2016 г.
 */
package ru.urfu.decorator;

import java.util.UUID;

import ru.urfu.decorator.models.client.IClient;
import ru.urfu.decorator.models.message.Message;

/**
 * @author lifeandfree
 */
public class HideUsersDecorator implements IClient {

    IClient iClient;

    public HideUsersDecorator(IClient iClient) {
        this.iClient = iClient;
    }

    @Override
    public Message getMessage() {
        return hideUsers(iClient.getMessage());
    }

    private Message hideUsers(Message message) {
        message.setAuthor(UUID.randomUUID().toString());
        message.setReceiver(UUID.randomUUID().toString());
        return message;

    }

    @Override
    public void sendMessage(Message message) {
        iClient.sendMessage(hideUsers(message));
    }

}
