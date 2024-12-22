public class Main
{
	public static void printStar() {
		System.out.print("*");
	}
	public static void printE() {
		System.out.print("e");
	}
	public static void printSpace() {
		System.out.print(" ");
	}
	public static void printPattern(int n) {
		for(int i=0; i<n+2; i++) {
			for(int j=0; j<4*n-1; j++) {
				if(i==0) {
					if(j<4*n-1-n+1) {
						printSpace();
					}
					else {
						printE();
					}
				}
				else if(i==n+1) {
					if(j<n-1) {
						printE();
					}
					else {
						printSpace();
					}
				}
				else if(i==(n+2)/2) {
					if(j<n-2 || j>4*n-1-(n-1)) {
						printSpace();
					}
					else if(j==n-2 ||j==(4*n-1)/2 || j==4*n-1-(n-1)) {
						printStar();
					}
					else {
						printE();
					}
				}
				else if(i==1) {
					if(j==(4*n-1)/2|| j==4*n-1-(n-1))
						printStar();
					else {
					    printSpace();
					}
				}
				else if(i==n) {
				    if(j==n-2 ||j==(4*n-1)/2) {
				        printStar();
				    }
				    else {
				        printSpace();
				    }
				}
				else {
				    if(j==n-2 ||j==(4*n-1)/2 || j==4*n-1-(n-1)) {
					printStar();
				}
					else printSpace();
			}
		}
		System.out.println();
}
}

public static void main(String[] args) {
	printPattern(11);
}
}
