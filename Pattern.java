public class Pattern  
{    
public static void main(String args[])   
{    

int m, n, r = 4,co=5;       
  
for(m = 1; m <= r; m++)
{
	for(n = 1; n <= co; n++)
	{
	System.out.print("* "); 
	}
 
	System.out.print("\n"); 


}
 
int i, j, row = 4;       
  
for (i=0; i<row; i++)   
{  
     
	for (j=row-i; j>1; j--)   
	{  
 
	System.out.print(" ");   
	}   
 
	for (j=0; j<=i; j++ )   
	{   
      
	System.out.print("* ");   
	}   
 
	System.out.println();   
}   

}   
}  