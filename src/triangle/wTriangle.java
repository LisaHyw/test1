package triangle;

import java.util.Scanner;

public class wTriangle {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); 
		System.out.println("������������������a��b��c���ֱ�Ϊ�����������ߵĳ���");
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
			return "�߲��ܷ���";
		}
		else if((a+b<=c)||(a+c<=b)||(b+c<=a)) {
			return "���ܹ���������";
		}
		else if((a==b)&&(b==c)) {
			return "�ȱ�������";
		}
		else if((a==b)||(a==c)||(b==c)) {
			return "����������";
		}
		else {
			return "��ͨ������";
		}
	}
			
}
