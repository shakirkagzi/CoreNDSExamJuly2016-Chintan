package reader;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class DataReader {

	public static void main(String[] args)throws IOException {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		//String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";
		String textFile = System.getProperty("user.dir") + "/src/data/myfile.txt";
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(textFile);
			br = new BufferedReader(fr);
			String text = "";
			while ((text = br.readLine()) != null) {
				System.out.println(text);
			}
		} catch (Exception ex) {
			System.out.println("Invalid File Path...!!!");
		} finally {
			fr.close();
			br.close();

		}
	}

}
