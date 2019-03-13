package com.app1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Test {
public static  String JSON_FILE="D:/Test.json";
	
	public static void main(String[] args) throws IOException {
		
		InputStream fis = new FileInputStream(JSON_FILE);
		
	
          JsonReader jsonReader = Json.createReader(fis);
		
		
		
		JsonObject jsonObject = jsonReader.readObject();
		
		jsonReader.close();
		fis.close();
//	ArrayList<Employee> al = new ArrayList<Employee>();
			
		
		Employee emp = new Employee();
		
		emp.setId(jsonObject.getInt("id"));
		emp.setName(jsonObject.getString("name"));
		emp.setPermanent(jsonObject.getBoolean("permanent"));
		emp.setRole(jsonObject.getString("role"));

		System.out.println(emp);
Configuration a = new Configuration();
		
		a.configure();
		SessionFactory b = a.buildSessionFactory();
		Session o = b.openSession();
//	Transaction t = o.getTransaction();
//	t.begin();
//	
//	o.persist(emp);
//	t.commit();
//	String sum="select *from json where ID=123";
//	Employee employee = o.get(Employee.class,sum);
//	
//	System.out.println(employee.getName());
	o.close();
	b.close();
	
	}
}








































































//	public static final String JSON_FILE="employee.txt";
//	
//	
//	public static void main(String[] args) throws IOException {
//		InputStream fis = new FileInputStream(JSON_FILE);
//		
//		//create JsonReader object
//		JsonReader jsonReader = Json.createReader(fis);
//		
//		/**
//		 * We can create JsonReader from Factory also
//		JsonReaderFactory factory = Json.createReaderFactory(null);
//		jsonReader = factory.createReader(fis);
//		*/
//		
//		//get JsonObject from JsonReader
//		JsonObject jsonObject = jsonReader.readObject();
//		
//		//we can close IO resource and JsonReader now
//		jsonReader.close();
//		fis.close();
//		
//		//Retrieve data from JsonObject and create Employee bean
//		Employee emp = new Employee();
//		
//		emp.setId(jsonObject.getInt("id"));
//		emp.setName(jsonObject.getString("name"));
//		emp.setPermanent(jsonObject.getBoolean("permanent"));
//		emp.setRole(jsonObject.getString("role"));
//		
////		//reading arrays from json
////		JsonArray jsonArray = jsonObject.getJsonArray("phoneNumbers");
////		long[] numbers = new long[jsonArray.size()];
////		int index = 0;
////		for(JsonValue value : jsonArray){
////			numbers[index++] = Long.parseLong(value.toString());
////		}
////		emp.setPhoneNumbers(numbers);
////		
////		//reading inner object from json object
////		JsonObject innerJsonObject = jsonObject.getJsonObject("address");
////		Address address = new Address();
////		address.setStreet(innerJsonObject.getString("street"));
////		address.setCity(innerJsonObject.getString("city"));
////		address.setZipcode(innerJsonObject.getInt("zipcode"));
////		emp.setAddress(address);
//		
//		//print employee bean information
//		System.out.println(emp);
//		
//	}
//
//}
//
//
//
//
//


