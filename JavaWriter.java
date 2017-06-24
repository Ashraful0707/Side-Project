import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class JavaWriter {

	public static void main(String[] args) {
	
		String name = "Babu";
		 int age = 27;
		String gender = "Male"; 
		String filepath = "cat.text";
		Writer(name,age,gender,filepath);
}
	
	
	public static void Writer( String name, int age, String gender, String filepath){
		try{
			FileWriter fv = new FileWriter(filepath,true);
			BufferedWriter bf = new BufferedWriter(fv);
			PrintWriter p = new PrintWriter(bf);
			
			p.println(name+","+gender+","+age);
			p.flush();
			p.close();
			JOptionPane.showMessageDialog(null, "saved");
			
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, " Not saved");
		}
	}
}
