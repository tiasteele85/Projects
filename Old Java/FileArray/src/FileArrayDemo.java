import java.io.*;


public class FileArrayDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream f = new FileOutputStream("file.dat");
		DataOutputStream output = new DataOutputStream(f);
		FileInputStream in = new FileInputStream("file.dat");
		DataInputStream input = new DataInputStream(in);		
		int[] array = {1,2,3,4,5,6};
		
		
		FileArray.writeArray(output, array);
		
		FileArray.readArray(input, array);
		
		
		
	}

}
