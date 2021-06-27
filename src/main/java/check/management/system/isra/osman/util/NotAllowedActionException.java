package check.management.system.isra.osman.util;

//this class catch if an account tried to be deleted while it is a foriegn key in a cheque table
public class NotAllowedActionException extends Exception {
	
	private int e; 
	
	public NotAllowedActionException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
