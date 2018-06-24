package webCrawler;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class callPy {
	
	
		public static void main(String a[]){
			try{
			 
			String prg = "def divide_sent(txt):\n from nltk.tokenize import sent_tokenize\n sent_tokenize_list = sent_tokenize(txt)\n len(sent_tokenize_list)\n print (sent_tokenize_list)\ndivide_sent('iam a boy. you are a girl. Are you a boy?')"
;
			BufferedWriter out = new BufferedWriter(new FileWriter("C:/Users/USER/PycharmProjects/tryoupPy/divideTo Sentences.py"));
			out.write(prg);
			out.close();
			int number1 = 10;
			int number2 = 32;
			 
			ProcessBuilder pb = new ProcessBuilder("python","C:/Users/USER/PycharmProjects/tryoupPy/divideTo Sentences.py",""+number1,""+number2);
			Process p = pb.start();
			 
			BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
			int ret = new Integer(in.readLine()).intValue();
			System.out.println("value is : "+ret);
			}catch(Exception e){System.out.println(e);}
			}
			}
		 