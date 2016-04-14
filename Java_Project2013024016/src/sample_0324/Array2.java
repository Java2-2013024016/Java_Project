package sample_0324;

public class Array2{
	public static void main(String[]args){

		int[][] array2=new int[2][4];

		for (int i=0,r=1;i<2;i++){
			for(int j=0;j<4;j++,r++){
				//array2[i][j]={r};
				//System.out.print(array[i][j]);
			}
			System.out.println(" ");
		}

		int[] arr={1,3,5,10,6,7};

		for(int arrP:arr){
			System.out.print(arrP+" ");
		}
	}
}
