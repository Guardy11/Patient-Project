class Mystack{
	int[] numbers;
	int top;
	
	public Mystack(int size){
		numbers = new int[size];
		
		top = -1;
	}
	public void push(int num){
		if(isFull()){
			System.out.print("Your Stack is Full!");
		}else{
			top++;
			
			numbers[top] = num;
		}
	}
	public int pop(){
		if(isEmpty()){
			System.out.print("Your Stack is Empty!");
			return -1;
		}else{
			int temp = numbers[top];
			numbers[top] = 0;
			
			top--;
			
			return temp;
		}
	}
	public int peek(){
		if(isEmpty()){
			System.out.print("Your Stack is Empty!");
			return -1;
		}else{
			return numbers[top];
		}
	}
	public boolean isFull(){
		if (top == numbers.length){
			return true;
		}
		return false;
	}
	public boolean isEmpty(){
		if (top == -1){
			return true;
		}
		return false;
	}
	public void display(){
		for(int i = 0 ;i < numbers.length; i++){
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}
}


