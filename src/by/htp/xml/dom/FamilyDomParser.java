package by.htp.xml.dom;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import by.htp.xml.entity.Families;
import by.htp.xml.sax.FamalySaxHandler;
import by.htp.xml.sax.FamilyParser;

public class FamilyDomParser implements FamilyParser {
	public Families parseFamilyDoc(String Path) {
		
		
			DocumentBuilderFactory builderFactory =DocumentBuilderFactory.newInstance();
			try {
				DocumentBuilder documentBuilder=builderFactory.newDocumentBuilder();
				Document document=documentBuilder.parse(Path);
				Element element=document.getDocumentElement();
				
				
				System.out.println("Docm element "+element.getTagName());
				NodeList childNode =element.getChildNodes();
				 doRec(childNode) ;
//				NodeList childNode =element.getElementsByTagName("mother");
//				
//				for(int i=0;i<childNode.getLength();i++) {
//					Node node=childNode.item(i);
//					System.out.println("Node:"+ ((Element)node).getTagName());
//				}
//					NodeList childNode1 =element.getElementsByTagName("children");	
//					for(int j=0;j<childNode1.getLength();j++) {
//						Node node2=childNode1.item(j);
//						System.out.println("Node:"+ ((Element)node2).getTagName());
//						NodeList nodech2= node2.getChildNodes();
//						if(nodech2!=null) {
//						for(int k=0; k<nodech2.getLength();k++) {
//							Node nodech2_2 =nodech2.item(k);
//							System.out.println("Node child:"+ (nodech2_2).get;
//						}
					
				
				System.out.println();
						}
					
			 catch (ParserConfigurationException | IOException | SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return null;	
	}	
	public void doRec(NodeList nodeList) {
		if(nodeList!=null) {
			for(int i=0;i<nodeList.getLength();i++) {
				Node node=nodeList.item(i);
				System.out.println(node.getNodeName());
				System.out.println((node).getTextContent());
				
				NodeList nodeList2 =node.getChildNodes();
				doRec(nodeList2);
			}
			
					
		}
		
		
		
	}
}
