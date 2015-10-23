class Temp{
	public static void main(String[] args){
		
		MyQueue cr = new MyQueue(5);
		
		cr.enqueue(5);
		cr.enqueue(17);
		cr.enqueue(11);
		cr.enqueue(34);
		cr.enqueue(18);
		
		cr.display();
		
		cr.dequeue();
		cr.dequeue();
		cr.dequeue();
		
		cr.display();
		
		System.out.println("Peek Front: " + cr.peekFront());
		System.out.println("Peek Rear: " + cr.peekRear());
	}
}