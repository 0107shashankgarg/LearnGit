package com.Demo.models;

import org.w3c.dom.Element;

import com.Demo.Setup.GetAttributes.CreateDataSet;
import com.Demo.Setup.GetAttributes.XmlParser;


public class ChildDetailsModel extends CreateDataSet {

	String path;
	String root;
	String node;
	String id;
	Element eElement;
	public static String FirstName,LastName,MiddleName,SubjectId,Gender;

	XmlParser xpar = new XmlParser();


	public ChildDetailsModel(String path, String root, String node) {
		this.path = path;
		this.root = root;
		this.node = node;
		eElement = xpar.getNode(path, root, node);
		buildData();
	}

	public ChildDetailsModel() {
		
	}

	public void buildData() {
		FirstName  = GetData("FirstName", eElement);
		LastName =   GetData("LastName", eElement);
		MiddleName = GetData("MiddleName", eElement);
		SubjectId =  GetData("SubjectId", eElement);
		Gender =     GetData("Gender", eElement);			



	}

}
