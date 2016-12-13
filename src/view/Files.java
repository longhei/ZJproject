package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Files {
			public static void main(String[] args) {
				/*BufferedReader br=null;
				try {
					 br=new BufferedReader(new InputStreamReader(System.in));
					char g;
					do {
						g=(char) br.read();
						System.out.println(g);
					} while (g!='q');
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					try {
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}*/
				
				
				   try{
					      
					      /*FileOutputStream os = new FileOutputStream("d:/test.txt");
					    	  os.write(65); 
					    	  os.close();
					    FileInputStream fs=new FileInputStream("d:/test.txt");
					    int s=0;
					    while ((s=fs.read())!=-1) {
							System.out.println((char)s);
						}
					    fs.close();*/
					   
					    /*InputStream is = new FileInputStream("d:/test.txt");
					    InputStreamReader isrs=new InputStreamReader(is, "utf-8");
					   while (isrs.ready()) {
						   System.out.print(String.valueOf(isrs.read()));	
					}
					      is.close();
					      isrs.close();*/
					   
					   
					   InputStreamReader isr=new InputStreamReader(System.in);
					   BufferedReader br=new BufferedReader(isr);
					   
					   FileWriter fw=new FileWriter("d:/bv.txt");
					   BufferedWriter bw=new BufferedWriter(fw);
					   String gString;
					   while ((gString=br.readLine()).length()>0) {
						   System.out.println(gString);
						bw.write(gString);
						bw.flush();
					}
					   bw.close();
					   fw.close();
					   br.close();
					   isr.close();
					   
					   
					   
					   
					   
					   
					   
					   
					   
					    }catch(IOException e){
					      System.out.print("Exception");
					    } 
			}
}
