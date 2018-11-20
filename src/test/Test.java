package test;

import java.util.Scanner;

/**
 * @author 刘亚东
 * @date 2018/11/20
 *	 输入一个真值（整数）求它的原码，反码，补码
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("真值--〉原码");
		System.out.println("请输入一个整数!!!!!");
		Scanner sc=new Scanner(System.in);
		int value=sc.nextInt();          
		StringBuilder syuan=new StringBuilder();
		if(value>0)
		{
			String Bvalue=Integer.toBinaryString(value);//将一个整数转换成字符串类型的二进制数
			int n=Bvalue.length();  //二进制的数字的个数n
			syuan.append("0,");
			syuan.append(Bvalue);
			System.out.println("原码是"+syuan);
			System.out.println("补码是"+syuan);
			System.out.println("反码是"+syuan);
			
//			System.out.println("二进制数的n  "+n);
		}
		else if(value<0)
		{	
			int value2=Math.abs(value);         //负数的绝对值
			int value3=value2-1;           //减一求反，求补码
			String Bvalue=Integer.toBinaryString(value2);
			String BFvalue=Integer.toBinaryString(~value2);
			int n=Bvalue.length(); 
			String str=BFvalue.substring(BFvalue.length()-n);     //截取反码的后几个数
			syuan.append("1,");
			syuan.append(Bvalue);
			System.out.println("原码是:"+syuan);
			System.out.println("反码是:1,"+str);
			String BBvalue=Integer.toBinaryString(~value3);
			String str3=BBvalue.substring(BFvalue.length()-n);
			System.out.println("补码是:1,"+str3);
		}
		else
		{
			System.out.println("0的原码不唯一");
			System.out.println("[+0]的原码是00.....0");
			System.out.println("[-0]的原码是10.....0");
			System.out.println("--------------------------------------------");
			System.out.println("0的补码唯一");
			System.out.println("[+0]和[-0]的补码都是00.....0");
			System.out.println("---------------------------------------------");
			System.out.println("0的反码不唯一");
			System.out.println("[+0]的反码是00..........0");
			System.out.println("[-0]的反码是11..........1");
		}
		System.out.println("-------------------------------------------------");
		
	}
}
