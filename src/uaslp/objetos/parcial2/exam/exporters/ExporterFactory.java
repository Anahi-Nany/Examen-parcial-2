package uaslp.objetos.parcial2.exam.exporters;

public class ExporterFactory {

    public static Exporter getExporter(ExporterType type) {
        switch(type){
            case XML -> {return new XmlExporter();}
            case HTML -> {return new HtmlExporter();}
            case JSON -> {return new JsonExporter();}
        }return null;
    }
}


