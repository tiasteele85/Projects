import java.io.DataOutputStream;
import java.io.*;

public class FileArray
{

	
	public static void writeArray(DataOutputStream output, int[] num) throws IOException
	{
		for(int count = 0; count < num.length; count++)
		{
			output.writeInt(num[count]);
		}
		
		output.close();
		System.out.println("Write Successful");
		
		
	}
	
	
	public static void readArray(DataInputStream input, int[] num) throws IOException
	{	
		boolean flag = true;
		int temp,
			count = 0;
		
		
		while(flag)
		{
			try
			{
				temp = input.readInt();
				num[count] = temp;
				count++;
			}
			catch (EOFException e)
			{
				flag = false;
			}
		}
		input.close();
		System.out.println("Successful Read");
		
		
	}
}
