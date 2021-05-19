
public class feature1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int[] RandomDiamond() {
	    int[] array = new int[10]; 
	    String[] array2 = new String[] 
	            {"bob", "carl", "max", "sally", "rachel", "josh", "mark", "matt", "john", "laban"};
	    for( int j = 0; j < array.length; j++) {
	        array[j] = (int) (Math.random()*9);
	        
	    }
	    for( int x = 0; x < array.length; x++) {
	        if (array[x] == 0)
	            array2[x] = array2[x] + " got a diamond! :D";
	        else
	            array2[x] = array2[x] + " got some coal :(";
	    }
	    for (int i = 0; i < array2.length; i++) {
	        System.out.println(array2[i]);
	    
	    }
	    
	    return array;
	}

}
