package java_study.chap_14.sec_02;

import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("/database.properties").getPath();
		System.out.println(path);
		path = URLDecoder.decode(path, "utf-8");
		properties.load(new FileReader(path));
		
		String dirver = properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println("driver: " + dirver);
		System.out.println("url: " + url);
		System.out.println("username: " + username);
		System.out.println("password: " + password);
	}

}
