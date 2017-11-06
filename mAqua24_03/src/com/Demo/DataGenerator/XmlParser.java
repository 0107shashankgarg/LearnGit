package com.Demo.DataGenerator;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlParser {

	public Element getNode(String path, String root, String node) {
		Element collectonElement = null;
		try {
			// System.out.println(path + "    " + root + "  " + node);
			File fXmlFile = new File(path);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

			doc.getDocumentElement().normalize();

			NodeList nList = doc.getElementsByTagName(root);

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);

				// System.out.println("\nCurrent Element :" +
				// nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					if (eElement.getAttribute("id").equals(node)) {
						collectonElement = eElement;

					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return collectonElement;

	}

}
