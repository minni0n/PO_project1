package universitymanager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MojJUnit {

	@Test
	void test1() throws Exception {
		String pesel = "81010200141";//poprawny numer PESELu
		SprPesel pes1 = new SprPesel();
		try {
			 pes1.sprawdzanie(pesel);
			 Assert.assertEquals(true, pes1.sprawdzanie(pesel));
		}
		catch (Exception e) {
			   fail(e.getMessage());
		}

	}
	
	@Test
	void test2() throws Exception {
		String pesel = "00000000001"; //niepoprawny numer PESELu
		SprPesel pes1 = new SprPesel();
		try {
			 pes1.sprawdzanie(pesel);
			 Assert.assertEquals(true, pes1.sprawdzanie(pesel));
		}
		catch (Exception e) {
			   fail(e.getMessage());
		}

	}
}
