package guessNumber;

import java.util.Random;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class UserNumberBean {

	Integer randomInt = null;
	Integer userNumber = null;
	String response = null;
	private long maximum = 10;
	private long minimum = 0;
	
	public UserNumberBean() {
		
		Random randomGR = new Random();
		randomInt = new Integer(randomGR.nextInt(10));
		System.out.println("Duke's number: " + randomInt);
		
	} // end constructor

	
	public Integer getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(Integer userNumber) {
		this.userNumber = userNumber;
	}

	public String getResponse() {
		if ((userNumber != null) && (userNumber.compareTo(randomInt) == 0)) 
			return "Yay! You got it!";
		else
			return "Sorry, " + userNumber + " is incorret." + "The correct number is " + randomInt;
	}

	public long getMaximum() {
		return maximum;
	}

	public void setMaximum(long maximum) {
		this.maximum = maximum;
	}

	public long getMinimum() {
		return minimum;
	}

	public void setMinimum(long minimum) {
		this.minimum = minimum;
	}
	
	
} // end UseNumberBean class
