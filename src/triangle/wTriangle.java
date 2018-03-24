package triangle;

import java.util.Scanner;

public class wTriangle {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		System.out.println("请依次输入三个整数a、b、c，分别为三角形三条边的长度");
		System.out.print("a:");
		int a = sc.nextInt(); 
		System.out.print("b:");
		int b = sc.nextInt(); 
		System.out.print("c:");
		int c = sc.nextInt(); 
		sc.close();
		
		String s=whichTriangle(a,b,c);
		System.out.println(s);
	}	
	
	public static String whichTriangle(int a, int b, int c) {
		if((a<=0)||(b<=0)||(c<=0)) {
			return "边不能非正";
		}
		else if((a+b<=c)||(a+c<=b)||(b+c<=a)) {
			return "不能构成三角形";
		}
		else if((a==b)&&(b==c)) {
			return "等边三角形";
		}
		else if((a==b)||(a==c)||(b==c)) {
			return "等腰三角形";
		}
		else {
			return "普通三角形";
		}
	}
			
}
