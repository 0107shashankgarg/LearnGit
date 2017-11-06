package com.Demo.models;

import java.util.HashMap;

import org.w3c.dom.Element;

import com.Demo.DataGenerator.CreateDataSet;
import com.Demo.DataGenerator.XmlParser;



public class LoginModel extends CreateDataSet {

	String path;
	String root;
	String node;
	String id;
	Element eElement;
	public static String Username, Password;
	XmlParser xpar = new XmlParser();
	HashMap hm = new HashMap();

	public LoginModel(String path, String root, String node) {
		//System.out.println("ist passed...");
		this.path = path;
		this.root = root;
		this.node = node;
		eElement = xpar.getNode(path, root, node);
		buildData();
	}
	public LoginModel()
	{

	}

	public void buildData() {

		Username  = GetData("UserName", eElement);
		Password =   GetData("Password", eElement);

	}

}
