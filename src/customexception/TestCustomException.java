package customexception;

public class TestCustomException {
	public static void main(String[] args) {
		String s1="1234567891";
		try {
		checkAdharCardNo(s1);
		}
		catch(AdharCardNoInvalidException e) {
		e.printStackTrace();
		}
	}
		
		 static boolean checkAdharCardNo(String s)throws AdharCardNoInvalidException {
			
			if(s.length()==12)
				return true;
			else {
				throw new AdharCardNoInvalidException("Adhar Card Number is not valid!!!");
			}
	}

}
