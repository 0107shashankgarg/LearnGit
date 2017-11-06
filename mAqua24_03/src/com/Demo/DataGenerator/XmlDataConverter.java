package com.Demo.DataGenerator;
import java.io.File;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XmlDataConverter {
	String nodeId = null;
	boolean pushDataStatus = true;
	String parentNode = null;
	HashMap lowDataSet = new HashMap();
	String lowDatasetId = null;
	boolean exitLoopStatus = true;
	String idNodeName = null;
	HashMap dataSet=new HashMap();
	public HashMap getXmlData(String xmlFilePath, String id) {

		try {
			File xmlFile = new File(xmlFilePath);
			nodeId=id;
			DocumentBuilder documentBuilder = DocumentBuilderFactory
					.newInstance().newDocumentBuilder();

			Document document = documentBuilder.parse(xmlFile);

			// System.out.println("Root element :"+
			// document.getDocumentElement().getNodeName());
			// System.out.println("===============================");

			if (document.hasChildNodes()) {

				dataSet=printNodeList(document.getChildNodes());
				//System.out.println(dataSet);
			//	data.remove(parentNode);
				

			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		TestData.pushData(parentNode, dataSet);
		return dataSet;
		
	}

	private HashMap printNodeList(NodeList nodeList) {

		for (int count = 0; count < nodeList.getLength(); count++) {

			Node elemNode = nodeList.item(count);

			if (elemNode.getNodeType() == Node.ELEMENT_NODE) {

				// get node name and value
				/*
				 * System.out.println("\nNode Name =" + elemNode.getNodeName() +
				 * " [OPEN]"); System.out.println("Node Content =" +
				 * elemNode.getTextContent());
				 */
				if (count == 0) {
					parentNode = elemNode.getNodeName();
					//System.out.println(parentNode);
					//lowDataSet.put("parentNode", parentNode);
				}
				if (!elemNode.getTextContent().trim().contains("\n")) {
				/*	System.out
							.println("\nNode Name =" + elemNode.getNodeName());
					System.out.println("Node Content ="
							+ elemNode.getTextContent());*/
					lowDataSet.put(elemNode.getNodeName(),
							elemNode.getTextContent());
				}

				if (elemNode.hasAttributes()) {

					NamedNodeMap nodeMap = elemNode.getAttributes();
					idNodeName = elemNode.getNodeName();
					for (int i = 0; i < nodeMap.getLength(); i++) {
						/*
						 * if (nodeId==null) { Node node = nodeMap.item(i);
						 * System.out.println("attr name : " +
						 * node.getNodeName());
						 * System.out.println("attr value : " +
						 * node.getNodeValue()); } else {
						 */
						if (nodeId.equalsIgnoreCase(nodeMap.item(i)
								.getNodeValue().toString())) {

							exitLoopStatus = false;
						//	System.out.println("it's working ");
							Node node = nodeMap.item(i);
							/*System.out.println("attr name : "
									+ node.getNodeName());
							System.out.println("attr value : "
									+ node.getNodeValue());*/

							idNodeName = node.getNodeName();
							pushDataStatus = true;
						} else {
							pushDataStatus = false;
						}

						// }

					}

				}

				if (elemNode.hasChildNodes()) {
					// recursive call if the node has child nodes
					if (pushDataStatus == true) {
						printNodeList(elemNode.getChildNodes());
					}

				}
				if (idNodeName.equals(elemNode.getNodeName())) {
					//System.out.println("its woiking for end" + lowDataSet);
					
				}
				/*
				 * System.out.println("Node Name =" + elemNode.getNodeName() +
				 * " [CLOSE]");
				 */
			}

		}
			return lowDataSet;
					
	}

}
