class Test{
	
	public static void main(String[] args){
		
		Mystack st = new Mystack(5);
		
		st.push(23);
		st.push(11);
		st.push(3);
		st.push(25);
		st.push(18);
		
		st.display();
		
		st.pop();
		st.pop();
		st.pop();
		
		st.display();
		
		System.out.println("Peek: " + st.peek());
	}
}