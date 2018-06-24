package webCrawler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class pythonProcess {
public void pyProcess (String Instruction){
	try{
		 
		BufferedWriter out = new BufferedWriter(new FileWriter("divideTo Sentences.py"));
		out.write(Instruction);
		out.close();
		int number1 = 10;
		int number2 = 32;
		 
		ProcessBuilder pb = new ProcessBuilder("python","divideTo Sentences.py",""+number1,""+number2);
		Process p = pb.start();
		 
		BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
		int ret = new Integer(in.readLine()).intValue();
		System.out.println("value is : "+ret);
		}catch(Exception e){System.out.println(e);}
}
}
