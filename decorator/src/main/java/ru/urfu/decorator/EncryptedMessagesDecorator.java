/**
 * @author lifeandfree
 *         Пакет: ru.urfu.decorator
 *         Дата создания класса: 22 нояб. 2016 г.
 */
package ru.urfu.decorator;

import ru.urfu.decorator.models.client.IClient;
import ru.urfu.decorator.models.message.Message;

/**
 * @author lifeandfree
 */
public class EncryptedMessagesDecorator implements IClient {

    public static String reverseByStringBuilder(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    IClient iClient;

    /**
     *
     */
    public EncryptedMessagesDecorator(IClient iClient) {
        this.iClient = iClient;
    }

    private Message decryptheMessage(Message message) {
        message.setText(reverseByStringBuilder(message.getText()));
        return message;

    }

    private Message encryptedMessage(Message message) {
        message.setText(reverseByStringBuilder(message.getText()));
        return message;

    }

    @Override
    public Message getMessage() {
        return decryptheMessage(iClient.getMessage());
    }

    @Override
    public void sendMessage(Message message) {
        iClient.sendMessage(encryptedMessage(message));
    }

}
