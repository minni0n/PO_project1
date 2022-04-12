package universitymanager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Zapis {
	public ArrayList<String> zapisywanie() throws IOException{
		SprPesel pes1 = new SprPesel();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> dane = new ArrayList<String>();
	     while (true){
	     	 System.out.print ("Prosze podac nazwe miasta, jezeli wszystkie dane podane proze naisac 'exit': " );
	         String cyt=reader.readLine();
	         if(cyt.equals("exit")) break;
	         System.out.print ("Prosze podac imie i nazwisko: " );
	         String nam=reader.readLine();
	         System.out.print ("Prosze podac numer PESELu: " );
	         String pes2=reader.readLine();
		        if(pes1.sprawdzanie(pes2) == true )
		        {
	         	dane.add(cyt + " " + nam + " "  + pes2);
		            int i = dane.size();
		            for(int j=0 ; j<i-1  ; j++)
		            {
		            	if(dane.get(j).contains(pes2)) 
		            	{
		            		dane.remove(j);
		            		break;
		            	}
		            }
		        }
		        else
		        {
		        	System.out.print ("Podany numer PESELu jest niepoprawny!\n" );
		        }
	     }
	    reader.close();
		return dane;

	}

}
