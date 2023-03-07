
public class WhileDoWhile {

	public static void main(String[] args) {
	int n=2;
	while(n<5) { //while only take boolean. n<5 true or false
		System.out.println(""+n);
	++n; // if true then the loop will continue 
	}
	int Sum=0;
	int x =5;
	int y =6;
	do {
		Sum=x+y;
		 System.out.println("Sum= "+Sum);  
	}
		while(x+y==12 && x == y); //if while condition is true then do will loop forever if while false then rest will be execute
	    System.out.println("x and y not equal x and y not equal to 12");
	}
}
