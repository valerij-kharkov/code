
public class Massive {
		
	
	
	
	

	
	
	
	
	int []arr= new int[30];
	
	
	int yakor=9;
	
	void pechat()
	{
		for(int i=0;i<30;i++)
		{
			System.out.print(arr[i]);
			if(i==yakor)
			{	yakor+=10;
			System.out.println();}
			
			
		}
		
	}
	
	void init(){
	for(int i=0;i<30;i++)
	{arr[i]= 1;}
	}
	
	
	
/*	public static void main (String []args){
		
		Massive mas=new Massive();
	mas.init();
	mas.pechat();
		int size=7;
		int [][] arr=new int [size][size];
		for(int i=0;i<size;i++)
			for(int j=0;j<size;j++)
			{
		if(j==3||i==3||i==j||(i+j)==6)
			arr[i][j]=2;
		else arr[i][j]=1;
		//System.out.println(" "+arr[i][j]);
		}
		int yakor= size-1;
		
		for(int i=0;i<size;i++)
			for(int j=0;j<size;j++)
			{
				System.out.print(arr[i][j]);
				if(j==yakor)
				{	
				System.out.println();}
			}
		int sum=0;int count=0;
		for(int i=size-1;i>0;i--)
		{	
			count++;			
		
			for(int j=0;j<size-count;j++)
			{
		if(arr[i][j]%2==0)
		{	
		sum++;}
			
		
			}
			//System.out.println ("    count: " +count);
	}//System.out.println ("    summa: " +sum);
	
*/
	public static void main (String []args){
	int D[][]=new int [4][5];
	
	for(int i=0;i<4;i++)
		{for(int j=0;j<5;j++)
			{D[i][j]=(int)(Math.random()*100);
			
		}
		
		}
		
		for(int i1=0;i1<4;i1++)
		{for(int j=0;j<5;j++)
		{
			
		System.out.print(" "+D[i1][j]);
		
		if(j==4) System.out.println();
		}
		
		}
	int min=D[1][0];int index=0;
	
	for(int i=0;i<D[0].length;i++)
	{if (min<D[1][i])
		{min=D[1][i];index=i;}
		
	}
	System.out.println();
	System.out.println(min+" "+index);
	
	swap(D, index);
	
	
	
	for(int i=0;i<4;i++)
	{
		System.out.print(" "+D[i][index]);
	}
	}

	private static void swap(int[][] D, int index) {
		for(int i=0;i<D.length;i++)
		{
		for(int j1=i+1;j1<D.length;j1++)
		{if(D[i][index]>D[j1][index])
		{int temp=D[i][index];
		D[i][index]=D[j1][index];
		D[j1][index]=temp;}
		}
		}
	}
}
