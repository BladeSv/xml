package by.htp.xml.Run;

import by.htp.xml.dom.FamilyDomParser;
import by.htp.xml.sax.FamilySaxParser;

public class MainApp {
public static void main(String[] args) {
	
	
	
	FamilyDomParser famalyParser =new FamilyDomParser();
	famalyParser.parseFamilyDoc("resourses/Famaly.xml");
}
}
