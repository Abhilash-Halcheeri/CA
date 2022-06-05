package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadCon {
	Properties pro;
	
	{
		File src=new File("./config//config.properties");
		
		try {
			FileInputStream fil = new FileInputStream(src);
			pro=new Properties();
			 try {
				pro.load(fil);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		}
		
		
		 public String URl()
		 {
			String URL= pro.getProperty("BaseURL");
			return URL;
		 }

		 
		 public String location()
		 {
			String dr= pro.getProperty("driver");
			return dr;
		 }
		 public String browser()
		 {
			String br= pro.getProperty("Browser");
			return br;
		 }
		 public String UserName()
		 {
			String UN= pro.getProperty("UserName");
			return UN;
		 }
		 public String PassWord()
		 {
			String pw= pro.getProperty("PassWord");
			return pw;
		 }
	}


