package test;

import java.util.Scanner;

/**
 * @author ���Ƕ�
 * @date 2018/11/20
 *	 ����һ����ֵ��������������ԭ�룬���룬����
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("��ֵ--��ԭ��");
		System.out.println("������һ������!!!!!");
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();          
		StringBuilder syuan=new StringBuilder();
		if(value>0)
		{
			String Bvalue=Integer.toBinaryString(value);//��һ������ת�����ַ������͵Ķ�������
			int n=Bvalue.length();  //�����Ƶ����ֵĸ���n
			syuan.append("0,");
			syuan.append(Bvalue);
			System.out.println("ԭ����"+syuan);
			System.out.println("������"+syuan);
			System.out.println("������"+syuan);
			
//			System.out.println("����������n      "+n);
		}
		else if(value<0)
		{	
			int value2=Math.abs(value);         //�����ľ���ֵ
			int value3=value2-1;           //��һ�󷴣�����
			String Bvalue=Integer.toBinaryString(value2);
			String BFvalue=Integer.toBinaryString(~value2);
			int n=Bvalue.length(); 
			String str=BFvalue.substring(BFvalue.length()-n);     //��ȡ����ĺ󼸸���
			syuan.append("1,");
			syuan.append(Bvalue);
			System.out.println("ԭ����:"+syuan);
			System.out.println("������:1,"+str);
			String BBvalue=Integer.toBinaryString(~value3);
			String str3=BBvalue.substring(BFvalue.length()-n);
			System.out.println("������:1,"+str3);
		}
		else
		{
			System.out.println("0��ԭ�벻Ψһ");
			System.out.println("[+0]��ԭ����00.....0");
			System.out.println("[-0]��ԭ����10.....0");
			System.out.println("--------------------------------------------");
			System.out.println("0�Ĳ���Ψһ");
			System.out.println("[+0]��[-0]�Ĳ��붼��00.....0");
			System.out.println("---------------------------------------------");
			System.out.println("0�ķ��벻Ψһ");
			System.out.println("[+0]�ķ�����00..........0");
			System.out.println("[-0]�ķ�����11..........1");
		}
		System.out.println("-------------------------------------------------");
		
	}
}
