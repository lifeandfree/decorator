package ru.urfu.decorator.models.message;

public class Message {

    private String author;
    private String receiver;
    private String text;

    public Message() {
        super();
        this.author = null;
        this.receiver = null;
        this.text = null;
    }

    public Message(String author, String receiver, String text) {
        super();
        this.author = author;
        this.receiver = receiver;
        this.text = text;

    }

    public String getAuthor() {
        return author;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message [author=" + author + ", receiver=" + receiver + ", text=" + text + "]";
    }

}
