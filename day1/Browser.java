package week1.day1;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dataType variableName = value
		//variable name which give inside main method - local variable
		//vairable - camel case
		
		int noOfTabOpen=3;
		String searchBox="Selenium";
		boolean tabsClose=true;
		char browserLog='c';
		float version=121.34f;
		long ph=45678990098765L;
		
		System.out.println("number of tabs open: "+noOfTabOpen);
		System.out.println("print search value: "+searchBox);
		System.out.println("Check current tab is closed: "+tabsClose+'\n'+"show the browser Log: "+browserLog
		+'\n'+"print the browser version: "+version);
}
}