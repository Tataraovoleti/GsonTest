/**
 * 
 */
package com.java.jsonparser;

import com.google.gson.Gson;

/**
 * @author Tatarao voleti
 *
 */
public class JsonParser {
	
	public static <T> String parseDataToJson(T bean){
		
		 String student =new Gson().toJson(bean);
		
		return student;
	}

}
