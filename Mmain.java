package universitymanager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Mmain {

	public static void main(String[] args) throws SprPesel {
		try {
    		System.out.print ("Prosze podac nazwe pliku: " );
    		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 	        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));
 	        ArrayList<String> dane = new ArrayList<String>();
 	        Zapis dane1 = new Zapis();
 	        dane = dane1.zapisywanie();
 	        for(int i=0;i<dane.size();i++)
		    {
 	        	writer.write(dane.get(i).toString());
		    	writer.append('\n');
		    }
		    reader.close();
		    writer.close();
    	}
    	catch(IOException e) {
			System.out.print("Error "+ e);
		}
	    
	}
}
