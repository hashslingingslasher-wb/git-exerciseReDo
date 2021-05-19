
public class feature2 {

	public static void main(String[] args) {
		//test for both features
		count(feature1.RandomDiamond());

	

	}
		public static void count(int[] array) {
		    int count = 0;
		    for (int i = 0; i < array.length; i++) {
		        if(array[i] == 0)
		            count++;	
		    }
		    System.out.println("We found "+ count+ " diamond(s)!");
		}
	}
	

