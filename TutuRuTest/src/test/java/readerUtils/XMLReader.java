package readerUtils;

import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XMLReader {
    private String pathToXMLFile;
    private String customElement;
    private NodeList strings;
    private Logger logger;

    public XMLReader(String xmlFilePath) {
        pathToXMLFile = xmlFilePath;
        logger = Logger.getLogger(XMLReader.class);
        getStringFromXML();
    }

    private void getStringFromXML() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document document = builder.parse(pathToXMLFile);
            Element root = document.getDocumentElement();

            strings = root.getChildNodes();
        } catch (Exception e) {
            logger.warn(e);
        }
    }


    public String getCustomElement(String elementName) {
        setCustomElement(strings, elementName);
        return customElement;
    }

    private void setCustomElement(NodeList nodeList, String name) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i) instanceof Element) {
                setCustomString(((Element) nodeList.item(i)), name);
                if (nodeList.item(i).hasChildNodes()) {
                    setCustomElement(nodeList.item(i).getChildNodes(), name);
                }
            }
        }
    }

    private void setCustomString(Element systemPrmtr, String name) {
        if (systemPrmtr.getTagName().contains(name)) {
            customElement = systemPrmtr.getTextContent();
        }
    }
}
