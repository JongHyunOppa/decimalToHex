import java.util.Scanner;
public class Week12
{
    //your variables and methods here...
    Scanner input = new Scanner(System.in);
		System.out.println("Enter dec number: ");
		int a = input.nextInt();
		DecToHex(a);
    
    public static void main(String[] args)
    {
        //your code here..
        char[] hexs = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
	              'A', 'B', 'C', 'D', 'E', 'F'};
		String hex = "";
		while(dec!=0){
			int rem = dec%16;
			hex = hexs[rem]+hex;
			dec = dec/16;
		}
		System.out.println(hex);
    }
}