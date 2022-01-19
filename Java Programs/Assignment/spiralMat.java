import java.util.*;
class spiralMat
{	public static void main(String args[])
	{		
		Scanner s=new Scanner(System.in);
		int n=5;	
		int a[][]={{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9}};
        	int i, k=0, l=0,m=5; 
           	
		for(i=0;i<5;i++)
		{ 	
			for(int j=0;j<5;j++)
			{	
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
        	while (k<m && l<n) 
        	{ 
            		for (i=l; i<n; ++i) 
            		{ 
                		System.out.print(a[k][i]+" "); 
            		} 
            		k++; 
   
            
            		for (i=k; i< m; ++i) 
            		{ 
                		System.out.print(a[i][n-1]+" "); 
            		} 
            		n--;	 
   
            
            		if (k<m) 
            		{ 
                		for (i=n-1; i>=l; --i) 
                		{ 
                		    System.out.print(a[m-1][i]+" "); 
               		 	} 
                	m--; 
            		} 
   
           	 	if (l<n) 
            		{ 
                		for (i=m-1; i>=k; --i) 
                		{ 
                    			System.out.print(a[i][l]+" "); 
                		} 
                	l++;     
            		}
		}  
		System.out.println();       
	}
}
			
		
		


		
	

	
		
					
			
	
				
			
			