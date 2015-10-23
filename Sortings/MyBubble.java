import java.util.Scanner;

public class MyBubble{
	
	public static void main(String[] args){
		int count, temp = 0, x, y;
		Scanner cr = new Scanner(System.in);
		
		System.out.print("How many numbers you like to sort? ");
		count = cr.nextInt();
		
		int sort[] = new int[count];
		System.out.println("Input " + count + " numbers: ");
		 
		for(x = 0; x < count; x++)
			sort[x] = cr.nextInt();	
		
	for (x = 0; x < ( count - 1 ); x++) {
		for (y = 0; y < count - x - 1; y++)
      {
        if (sort[y] > sort[y+1]) 
        {
           temp = sort[y];
           sort[y] = sort[y+1];
           sort[y+1] = temp;
        }         
      }
    }
 
    System.out.println("Ascending Formation:");
	 for (x = 0; x < count; x++)
      System.out.print(sort[x]+ " ");
 
  
  for (x = 0; x < ( count - 1 ); x++) {
		for (y = 0; y < count - x - 1; y++)
      {
        if (sort[y] < sort[y+1]) 
        {
           temp = sort[y];
           sort[y] = sort[y+1];
           sort[y+1] = temp;
        }         
      }
    }
 
     System.out.println("\nDescending Formation:");
	 for (x = 0; x < count; x++)
      System.out.print(sort[x]+ " ");
	 
	
}
}