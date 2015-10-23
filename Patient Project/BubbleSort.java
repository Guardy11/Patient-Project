class BubbleSort{
	
	Patient[] elements;
	
	public BubbleSort(int size){
		elements = new Patient[size];
	}
	 
	public void insert(int index, String fname, String lname, int age, String address){
		elements[index] = new Patient(fname, lname, age, address);
	}
	 
	public void sort(){
		Patient temp;
		for(int i = 0; i < elements.length -1; i++){
			for(int j = 0; j < elements.length -1; j++){
				if(elements[j].getAge() > elements[j + 1].getAge()){
					temp =  elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
			}
		}
	}
	
	public void display(){
		for(int i = 0; i < elements.length; i++){
		System.out.println("Fullname: " + elements[i].getFullname());
		System.out.println("Age: " + elements[i].getAge());
		System.out.println("Address: " + elements[i].getAddress());
		
		System.out.println();
		}
	}
}