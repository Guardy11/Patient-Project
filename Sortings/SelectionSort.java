public class SelectionSort {
 
        public static void main(String[] args) {
               

                int array[] = new int[]{8,12,11,34,22,69};
               
                System.out.println("Array Before Bubble Sort");
                for(int i=0; i < array.length; i++){
                        System.out.print(array[i] + " ");
                }
               
                selectionSort(array);
               
                System.out.println("");
               
                System.out.println("The numbers in Ascending");
                for(int i=0; i < array.length; i++){
                        System.out.print(array[i] + " ");
                }
			}
 public static int[] selectionSort(int array[])
// pre: array is full, all elements are valid integers (not null)
// post: array is sorted in ascending order (lowest to highest)
{
	for(int i = array.length - 1; i >= 0; i--)		
	{
		int highestValue = i;				
		for(int j = i; j >= 0; j--)			
		{
			if(array[j] > array[highestValue])	
				highestValue = j;		
		}
		
		int temp = array[i];
		array[i] = array[highestValue];
		array[highestValue] = temp;
	}
	return array;
}
}