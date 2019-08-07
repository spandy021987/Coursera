package Scripts;


import org.testng.annotations.Test;


import POM.Edurary;
import generics.Excel1;

import generics.Generic_class;

public class Edumain extends Generic_class {
	@Test
	public void testEdumain()
	{
		String ea= Excel1.getCellValue("Edumain",1,0);
		String pwd=Excel1.getCellValue("Edumain", 1, 1);
		Edurary el=new Edurary(driver);
		el.click();
		el. setemail(ea);
		el.setpassword(pwd);
		el.click3();
		
		

}}
