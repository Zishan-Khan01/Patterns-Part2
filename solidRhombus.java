public class solidRhombus{

	public static void solidRhombus(int n){
		//left inclined Rhombus
		for(int i=1; i<=n; i++){
			//printing n-i spaces in each line
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}
			//printing i stars in each line
			for(int j=1; j<=n; j++){
				System.out.print("*");
			}
			//after printing each row print next line
			System.out.println();
		}

		System.out.println("-------------------------");
		
		//right inclined Rhombus
		for(int i=1; i<=n; i++){
			//printing n-i spaces in each line
			for(int j=1; j<i; j++){
				System.out.print(" ");
			}
			//printing i stars in each line
			for(int j=1; j<=n; j++){
				System.out.print("*");
			}
			//after printing each row print next line
			System.out.println();
		}

	}

	public static void main(String[] args){
		solidRhombus(5);
	}
}