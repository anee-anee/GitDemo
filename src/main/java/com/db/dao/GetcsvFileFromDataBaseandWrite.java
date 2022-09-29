/*
 * package com.db.dao;
 * 
 * import java.io.BufferedInputStream; import java.io.BufferedOutputStream;
 * import java.io.BufferedReader; import java.io.BufferedWriter; import
 * java.io.File; import java.io.FileInputStream; import
 * java.io.FileNotFoundException; import java.io.FileOutputStream; import
 * java.io.FileReader; import java.io.FileWriter; import java.io.IOException;
 * import java.io.InputStream; import java.io.OutputStream; import
 * java.nio.file.Files; import java.nio.file.Paths; import java.sql.Connection;
 * import java.sql.DriverManager; import java.sql.ResultSet; import
 * java.sql.Statement; import java.util.ArrayList; import java.util.Arrays;
 * import java.util.List; import java.util.Scanner;
 * 
 * import com.mav.bean.Employe;
 * 
 * import au.com.bytecode.opencsv.CSVReader; import
 * au.com.bytecode.opencsv.CSVWriter;
 * 
 * 
 * public class GetcsvFileFromDataBaseandWrite { public static
 * BufferedInputStream readFromDataBaseContent() { BufferedInputStream bis =
 * null; try { File Fileobj = new
 * File("C:\\InputOutputBufferIO\\EmployeData.csv"); InputStream is = new
 * FileInputStream(Fileobj); bis = new BufferedInputStream(is); int ch; while
 * ((ch = bis.read()) != -1) { System.out.print((char) ch);
 * 
 * } bis.close(); bis.close();
 * 
 * } catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
 * e) { e.printStackTrace(); } return bis;
 * 
 * }
 * 
 * public static void writeContent() { BufferedOutputStream bos = null; try {
 * GetcsvFileFromDataBaseandWrite obj = new GetcsvFileFromDataBaseandWrite();
 * obj.setType(Employe.class); String[] columns = new String[] {"EmployeName",
 * "EmployeID"}; // the fields to bind do in your JavaBean
 * obj.setColumnMapping(columns);
 * 
 * CsvToBean csv = new CsvToBean();
 * 
 * String csvFilename = "C:\\\\InputOutputBufferIO\\\\Employe2.csv"; CSVReader
 * csvReader = new CSVReader(new FileReader(csvFilename));
 * 
 * List list = csv.parse(obj, csvReader); for (Object object : list) { Employe
 * emp = (Employe) object; System.out.println(emp.getEmployeID()); } }
 * //List<List<String>> records =
 * Arrays.asList(Arrays.asList(bos.getEmployeName(), "getEmployeID()",
 * "getSalary()"));
 * 
 * File Fileobjout = new File("C:\\InputOutputBufferIO\\Employe1.csv");
 * OutputStream os = new FileOutputStream(Fileobjout); bos = new
 * BufferedOutputStream(os);
 * 
 * 
 * 
 * //BufferedWriter writer =
 * Files.newBufferedWriter(Paths.get("C:\\InputOutputBufferIO\\Employe1.csv"));
 * BufferedInputStream bis = readFromDataBaseContent();
 * 
 * FileWriter outputfile = new FileWriter(Fileobjout);
 * 
 * 
 * 
 * 
 * 
 * 
 * } String csv = "C:\\\\InputOutputBufferIO\\\\Employe2.csv"; CSVWriter writer
 * = new CSVWriter(new FileWriter(csv));
 * 
 * String [] employe = "EmployeName#EmployeID#Salary".split("#");
 * 
 * writer.writeNext(employe);
 * 
 * writer.close(); } catch (FileNotFoundException e) { e.printStackTrace(); }
 * catch (IOException e) { e.printStackTrace();
 * 
 * } }
 * 
 * 
 * private void setType(Class<Employe> class1) { // TODO Auto-generated method
 * stub
 * 
 * }
 * 
 * private void setColumnMapping(String[] columns) { // TODO Auto-generated
 * method stub
 * 
 * }
 * 
 * public static void main(String[] args) { GetcsvFileFromDataBaseandWrite obj =
 * new GetcsvFileFromDataBaseandWrite();
 * 
 * readFromDataBaseContent(); writeContent(); } }
 * 
 */