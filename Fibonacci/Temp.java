public class Temp {
	public void Nacci(int n){
		int[] numbers = new int[n];
		int i=1;
		int f=0;

		for(int a = 2; a < n; a++){
			System.out.print(f+" ");
			f=f + i;
			i=f - i;
		}
	}
}