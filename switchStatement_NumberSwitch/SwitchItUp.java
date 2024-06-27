package switchStatement_NumberSwitch;

public class SwitchItUp {
	
	public static String switchItUp(int n) {
		System.out.println("Your chose: " + n);
		String number = "";
		switch (n) {
		  case 1:
		    System.out.println("One");
		    number = "One";
		    break;
		  case 2:
			    System.out.println("Two");
			    number = "Two";
			    break;
		  case 3:
			    System.out.println("Three");
			    number = "Three";
			    break;
		  case 4:
			    System.out.println("Four");
			    number = "Four";
			    break;
		  case 5:
			    System.out.println("Five");
			    number = "Five";
			    break;
		  case 6:
			    System.out.println("Six");
			    number = "Six";
			    break;
		  case 7:
			    System.out.println("Seven");
			    number = "Seven";
			    break;
		  case 8:
			    System.out.println("Eight");
			    number = "Eight";
			    break;
		  case 9:
			    System.out.println("Nine");
			    number = "Nine";
			    break;
		  case 0:
			    System.out.println("Zero");
			    number = "Zero";
			    break;
		  default:
		    System.out.println("Need a number from 0-9");
		    number = "empty!";
		}
		System.out.println("Your number: " + number);
		return number;
	}
	
	public static void main(String[] args) {
		switchItUp(1);
		System.out.println("----------------");
		switchItUp(11);
		System.out.println("----------------");
		switchItUp(4);
	}

}
