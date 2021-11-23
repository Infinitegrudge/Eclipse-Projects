package SortingPackage;
import java.util.Random;

import javax.swing.JOptionPane;

public class SortingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int howMany = checkInput(JOptionPane.showInputDialog(null, "How many numbers to be generated?")) - 1;
		int sortType = checkInput(JOptionPane.showInputDialog("Which sorting type\n1Selection\n2Bubble\n3Insertion\n4Quick"));
		int sortDirection = checkInput(JOptionPane.showInputDialog(null, "Which direction to Sort?\n1Up\n2Down"));
		int[] nums = ranNums(howMany);
		System.out.println("Before sorting:");
		
		print(nums);
		
		if (sortType == 1 && sortDirection == 1) {
			nums = selectionSortadd(nums);
		}
		else if (sortType == 1 && sortDirection == 2) {
			nums = selectionSortsub(nums);
		}
		else if (sortType == 2 && sortDirection == 1) {
			nums = bubbleSortadd(nums);
		}
		else if (sortType == 2 && sortDirection == 2) {
			nums = bubbleSortsub(nums);
		}
		else if (sortType == 3 && sortDirection == 1) {
			nums = insertionSortadd(nums);
		}
		else if (sortType == 3 && sortDirection == 2) {
			nums = insertionSortsub(nums);
		}
		else if (sortType == 4 && sortDirection == 1) {
			quickSort(nums, 0, nums.length - 1);
			for (int count = 0; count < nums.length; count++) {
			      System.out.print(nums[count] + " ");
			    }
			
		}
		
		else if (sortType == 4 && sortDirection == 2) {
			nums = insertionSortsub(nums);
			print(nums);
		}
		
		
		
		System.out.println("After sorting:");
		if (sortType != 4) {
			print(nums);
		}
	}
	
	static int checkInput(String in) {
		try {
			int output = Integer.parseInt(in);
			return output;
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "You did not enter a valid input");
			return 0;
		}
		

}
	static int[] ranNums(int howMany) {
		//Declare random
		Random rand = new Random();
		//Declare array for the random numbers
		int randoms[] = new int[howMany];
		
		//Loop through and fill the array
		for (int i = 0;i < randoms.length; i ++) {
			 randoms[i] =  rand.nextInt(1001);
		}
		
		return(randoms);
		}
	
	static void print(int[] toPrint) {
		
		for (int i = 0; i<toPrint.length;i++) {
			System.out.println(toPrint[i]);
		}
	}
	
	public static int[] selectionSortadd(int data[]) {
	    int smallest;
	    for (int i = 0; i < data.length - 1; i++) {
	      smallest = i;
	      //see if there is a smaller number further in the array
	      for (int index = i + 1; index < data.length; index++) {
	        if (data[index] < data[smallest]) {
	          swap(data, smallest, index);
	        }
	      }
	    }
	    return data;
	  }
	
	public static int[] selectionSortsub(int data[]) {
		int smallest;
	    for (int i = 0; i < data.length - 1; i++) {
	      smallest = i;
	      //see if there is a smaller number further in the array
	      for (int index = i + 1; index < data.length; index++) {
	        if (data[index] > data[smallest]) {
	          swap(data, smallest, index);
	        }
	      }
	    }
	    return data;
	  }
	
	 public static int[] bubbleSortadd(int data[]) {

		    //Loop to control number of passes
		    for (int pass = 1; pass < data.length; pass++) {
		      //Loop to control # of comparisons for length of array-1
		      for (int element=0;element<data.length-1;element++) {
		        //compare side-by-side elements and swap them if
		        //first element is greater than second element
		        if (data[element] > data[element + 1]) {
		          swap(data, element, element + 1);  //call swap method
		        }
		      }
		    }
		    return data;
		  }
	 
	 public static int[] bubbleSortsub(int data[]) {

		//Loop to control number of passes
		    for (int pass = 1; pass < data.length; pass++) {
		      //Loop to control # of comparisons for length of array-1
		      for (int element=0;element<data.length-1;element++) {
		        //compare side-by-side elements and swap them if
		        //first element is greater than second element
		        if (data[element] < data[element + 1]) {
		          swap(data, element, element + 1);  //call swap method
		        }
		      }
		    }
		    return data;
		  }
	 
	 public static int[] insertionSortadd(int data[]) {
		    int insert;

		    for (int next = 1; next < data.length; next++) {
		      insert = data[next];
		      int moveItem = next;

		      while (moveItem > 0 && data[moveItem - 1] > insert) {
		        data[moveItem] = data[moveItem - 1];
		        moveItem--;
		      }
		      data[moveItem] = insert;
		    }
		    return data;
		  }
	 
	 public static int[] insertionSortsub(int data[]) {
		    int insert;

		    for (int next = 1; next < data.length; next++) {
		      insert = data[next];
		      int moveItem = next;

		      while (moveItem > 0 && data[moveItem - 1] > insert) {
		        data[moveItem] = data[moveItem - 1];
		        moveItem--;
		      }
		      data[moveItem] = insert;
		    }
		    return data;
		  }
	 
	 public static void quickSort(int data[], int low, int high) {
		    int partitionLoc;
		    if (low < high) {
		      partitionLoc = partition(data, low, high);
		      quickSort(data, low, partitionLoc - 1);
		      quickSort(data, partitionLoc + 1, high);
		    }
		  }

		  public static int partition(int data2[],int left,int right) {
		    boolean moveLeft = true;
		    int separator = data2[left];

		    while (left < right) {
		      if (moveLeft == true) {
		        while ((data2[right] >= separator) && (left < right)) {
		          right--;
		        }
		        data2[left] = data2[right];
		        moveLeft = false;
		      } else {
		        while ((data2[left] <= separator) && (left < right)) {
		          left++;
		        }
		        data2[right] = data2[left];
		        moveLeft = true;
		      }
		    }
		    data2[left] = separator;
		    return left;
		  }

	  public static void swap(int array2[], int first, int second) {
	    int hold = array2[first];
	    array2[first] = array2[second];
	    array2[second] = hold;
	  }
	}
