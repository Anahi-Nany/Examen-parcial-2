package uaslp.objetos.parcial2.exam.messagebuilder;

public class MessageBuilderFactory extends MessageBuilder{
    //private static MessageType messageType;
    private static MessageBuilder messageBuilder;



    public static MessageBuilder getMessageBuilder(MessageType messageType) {
        //return messageBuilder(messageType).create();
        return MessageBuilder;

    }


    @Override
    protected static String getDescription(){
        return create();
    }
}
