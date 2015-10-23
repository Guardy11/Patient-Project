class MyQueue{
	
	int [] numbers;
	
	int nElement;
	
	public MyQueue(int size){
		numbers = new int[size];
		
		nElement = 0;
	}
	public void enqueue(int num){
		if(isFull()){
			System.out.print("Your items are full.");
		}else{
			numbers[nElement] = num;
			
			nElement++;
		}
	}
	public int dequeue(){
		int temp, i;
		if(isEmpty()){
			System.out.print("Your items are Empty.");
			return -1;
		}else{
			temp = numbers[0];
			for(i = 0; i < nElement-1; i++){
				numbers[i] = numbers[i+1];
			}
			for(int j = i; j < numbers.length; j++){
				numbers[j] = 0;
			}
			nElement--;
			
			return temp;
		}
	}
	public int peekFront(){
		if(isEmpty()){
			System.out.print("Your items are Empty.");
			return -1;
		}else{
			return numbers[0];
		}
	}
	public int peekRear(){
		if(isEmpty()){
			System.out.print("Your items are Empty.");
			return -1;
		}else{
			return numbers[nElement];
		}
	}
	public boolean isFull(){
		if(nElement == numbers.length){
			return true;
		}
		return false;	
	}
	public boolean isEmpty(){
		if(nElement == -1){
			return true;
		} 
			return false;
	}
	public void display(){
		for(int i = 0; i < numbers.length; i++){
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}
	
	}
	
