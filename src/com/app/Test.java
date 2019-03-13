package com.app;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Test {
public static void main(String[] args) {
	File fXmlFile=null;
	ArrayList<Employee> al=new ArrayList<Employee>();

	 try {

		 fXmlFile  = new File("D:/employee.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc =dBuilder.parse(fXmlFile);
			((Node) doc.getDocumentElement()).normalize();

			System.out.println("Root element :" + (doc.getDocumentElement()).getNodeName());
					
			NodeList nList = (doc).getElementsByTagName("Employee");
					
			System.out.println("----------------------------");
			for (int temp = 0; temp < nList.getLength(); temp++) {

				Employee e=new Employee();
				Node nNode = nList.item(temp);
						
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
						
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					
					e.setType(eElement.getAttribute("type"));
				e.setName(eElement.getElementsByTagName("Name").item(0).getTextContent());
			    e.setId(Integer.parseInt(eElement.getElementsByTagName("Id").item(0).getTextContent()));
			   e.setAge(Integer.parseInt(eElement.getElementsByTagName("Age").item(0).getTextContent()));
              al.add(e);
				}
			
			}
			
	
}catch(Exception e){
	e.printStackTrace();
}
	finally{
		System.out.println("finally is executin");
}
	
	
	System.out.println(al);
}
}
