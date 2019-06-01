package com.luv2code.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		try {
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// Read JJSON file and map / convert to Java Pojo:
			// data/sample-lite.json
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
						
			// print first name ans last name
			System.out.println(theStudent.toString());
			
			//print out Address 
			Address tempAddress = theStudent.getAddress();
			System.out.println(tempAddress.toString());
			
			//print ou languages
			for(String tempLang : theStudent.getLanguages()) {
				System.out.println(tempLang);
			}
			
		}catch(Exception exc) {
			exc.printStackTrace();
		}
	}
	
}
