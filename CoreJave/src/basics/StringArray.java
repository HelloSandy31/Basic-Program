package basics;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr = new String[3];
//add element into the string array
		arr[0] = "Hello";
		arr[1] = "Java";
		arr[2] = "Programming";

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}