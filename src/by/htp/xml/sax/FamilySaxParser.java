package by.htp.xml.sax;

import java.io.IOException;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import by.htp.xml.entity.Families;

public class FamilySaxParser implements FamilyParser {
	
	public Families parseFamilyDoc(String Path) {
	
	try {
		XMLReader reader =XMLReaderFactory.createXMLReader();
		reader.setContentHandler(new FamalySaxHandler());
		reader.parse(Path);
	} catch (SAXException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
		
	return null;	
	}
}
