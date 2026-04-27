public class invertedHalfPyramid{
	public static void invertedHalfPyramid(int n){
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n-i+1; j++){
				System.out.print(j+" ");
			}
			//after printing each row print next line
			System.out.println();
		}
	}

	public static void main(String[] args){
		invertedHalfPyramid(4);
	}
}