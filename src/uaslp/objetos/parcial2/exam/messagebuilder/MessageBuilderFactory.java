package uaslp.objetos.parcial2.exam.messagebuilder;

public class MessageBuilderFactory extends MessageBuilder{

    public static MessageBuilder getMessageBuilder(MessageType messageType) {
       //creo un message builder
        return new MessageBuilder() {
            @Override
            protected String getDescription() {
                //el getdescription lo edito tambien, ahora toma en cuenta el tipo de mensaje
                final String name = messageType.name(); //al ser abstracta se usa final
                return name;
            }
          /* otra forma es hacer un switch de message type  y que segun lo que estuviera dentro
          creariamos un String dependiendo de tipos y eso regresariamos, es muy parecido a la forma de ExporterFactory
           */
        };
       }

    protected String getDescription() {
        return null;
    }
}
