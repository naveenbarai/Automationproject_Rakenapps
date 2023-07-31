package commonAssertion;

public class LoginAss {
	
	public void verifyTitle(String expVal,String actValue) {
		
		if(expVal.equals(actValue)) {
			System.out.println(actValue +"Title is matched");
		}
		else {
			System.out.println(actValue +"Title is not matched");
		}
	}

}
