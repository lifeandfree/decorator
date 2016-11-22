package ru.urfu.decorator;

import ru.urfu.decorator.models.client.Client;
import ru.urfu.decorator.models.message.Message;

public class App {
    public static void main(String[] args) {
        Client client = new Client();
        Message message = new Message("author", "receiver", "text");
        client.sendMessage(message);
        client.getMessage();

        HideUsersDecorator hideUsersDecorator = new HideUsersDecorator(client);
        hideUsersDecorator.sendMessage(message);
        hideUsersDecorator.getMessage();

        EncryptedMessagesDecorator encryptedMessagesDecorator = new EncryptedMessagesDecorator(client);
        encryptedMessagesDecorator.sendMessage(message);
        System.out.print(encryptedMessagesDecorator.getMessage().getText());

    }
}
