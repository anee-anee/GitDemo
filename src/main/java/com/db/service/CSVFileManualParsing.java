package com.db.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import com.mav.bean.Employe;
//import com.mav.bean.Employee;

public class CSVFileManualParsing {

	public static ArrayList<Employe> getContents() {
		ArrayList<Employe> empObj = new ArrayList<Employe>();
		 try {
			 
			 File file = new File("C:\\InputOutputBufferIO\\EmployeData.csv");
			 InputStream is = new FileInputStream(file);
			 BufferedInputStream bis = new BufferedInputStream(is);
			 int ch;
			 
			 String str = "";
			 while ((ch = bis.read()) != -1) {				
				
				str = str+(char)ch;
				 
			
			}
			 bis.close();
			String [] strArray = str.split("\n");
			
			for (int i = 0; i < strArray.length; i++) {
				String col [] = strArray[i].split(",");
				
				
				if(i != 0) {
					Employe emp = new Employe();
					emp.setEmployeName(col[0]);
					emp.setEmployeID(col[1]);
				    emp.setSalary(Integer.parseInt(col[2]));  
					empObj.add(emp);
					
				}
				
			}
			
		 }
		 catch (FileNotFoundException e) {
			// TODO: handle exception
		}catch (IOException e) {
			// TODO: handle exception
		}
		 return empObj;
		 
		// System.out.println(emp.get);
	}
	
	public static void writeContent() {
		BufferedOutputStream bos = null;
		try {
			File Fileobjout = new File("C:\\InputOutputBufferIO\\Empolye1.csv");
			OutputStream os = new FileOutputStream(Fileobjout);
			bos = new BufferedOutputStream(os);
			ArrayList<Employe>  bis = getContents();
			int ch;
			while((ch = bis.size())!= -1){
				bos.write(ch);
			}
			bos.flush();
			bos.close();
			((Closeable) bis).close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		
		}
		}
	

	public static void main(String[] args) {
		getContents();
		writeContent();
		System.out.print("success");
		// writeContent();
	}
}
