package IGA;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestEmployee {

	public static void main(String[] args) {
		
		Date date = new Date(); 
		SimpleDateFormat DateForc1 = new SimpleDateFormat("12/09/2020");
		String stringDate= DateForc1.format(date);
		
		Employee t1 = new Technicien("Ilias", "Tayb", 20, stringDate, 4, 20000, 6000, 0.1f, 20.0f);
		
		System.out.println(t1.descr());

	}

}
