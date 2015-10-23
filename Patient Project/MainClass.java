class MainClass{
	public static void main(String[] args){
		
		BubbleSort bs = new BubbleSort(10);
		
		bs.insert(0, "Christian", "Guardiana", 19, "Pangasinan" );
		bs.insert(1, "James", "Caampued", 31, "Pampanga" );
		bs.insert(2, "Jowin", "Cueto", 20, "Mindoro" );
		bs.insert(3, "Michael", "Agamin", 26, "Laguna" );
		bs.insert(4, "John Jay", "Mercines", 23, "La-union" );
		bs.insert(5, "John Yves", "Marin", 21, "Bulacan" );
		bs.insert(6, "Jeff Vincent", "Pecana", 18, "Metro Manila" );
		bs.insert(7, "Policarpio", "Dimaano", 32, "Isabela" );
		bs.insert(8, "Fernando", "Mindrano", 16, "Bicol" );
		bs.insert(9, "Nikki", "Porlucas", 22, "Tarlac" );
		
		System.out.print("----------------PATIENT LIST----------------");
		System.out.print("\n\nList Before Sort:");
		System.out.println();
		bs.display();
		
		System.out.println("\n\n");
		
		bs.sort();
		System.out.print("\n\nList After Sort(Order by Age):");
		System.out.println();
		bs.display();
		
	}
}