import java.io.*;
import java.util.*;
public class sumavg{
	public static void main(String[] args){
		int sum=0;
		float avg;
		for(int i=0;i<=10;i++){
			sum+=i;
		}
		avg=sum/10;
	        System.out.println("sum:"+sum);
		System.out.println("average:"+avg);
	}
}
