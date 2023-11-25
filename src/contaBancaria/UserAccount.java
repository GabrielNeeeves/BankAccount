package contaBancaria;

public class UserAccount {
	
	private String username;
	private double currentValue;
	
	public UserAccount(String name, double val) {
		this.setUsername(name);
		this.setCurrentValue(val);
	}

	//GET username
	public String getUsername() {
		return username;
	}
	
	//SET username
	public void setUsername(String username) {
		this.username = username;
	}

	//GET currentValue
	public double getCurrentValue() {
		return currentValue;
	}

	//SET currentValue
	public void setCurrentValue(double currentValue) {
		this.currentValue = currentValue;
	}
	
	//DEPOSIT method
	public void deposit(double depositVal) {
		this.currentValue += depositVal;
		System.out.println(depositVal+" have been added. Total is: R$"+this.currentValue);
		return;
	}
	
	//DRAFT method
	public void draft(double draftVal) {
		if(draftVal <= this.currentValue) {
			this.currentValue -= draftVal;
		}
		else {
			System.out.println("Insufficient funding. Try again.");
			return;
		}
	}
	
	//DISPLAY account information
	public void displayCurrentValue() {
		System.out.println("Username: "+username);
		System.out.println("You have a total of R$"+currentValue);
	}
}
