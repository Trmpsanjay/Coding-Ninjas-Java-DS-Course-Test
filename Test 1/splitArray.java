
public class solution {
    
    static boolean helper(int arr[], int n, int start, int leftsum, int rightsum) { 
  
    if (start == n) 
        return leftsum == rightsum; 
    if (arr[start] % 5 == 0) 
        leftsum += arr[start]; 
  
    else if (arr[start] % 3 == 0) 
        rightsum += arr[start]; 
  

    else
  
       
        return helper(arr, n, start + 1, leftsum + arr[start], rightsum) 
        || helper(arr, n, start + 1, leftsum, rightsum + arr[start]); 
  
    return helper(arr, n, start + 1, leftsum, rightsum); 
} 
    static boolean splitArray(int arr[], int n) 
{ 
    return helper(arr, n, 0, 0, 0); 
} 
  
  

	public static boolean splitArray(int input[]) {
        return splitArray(input,input.length);
		/* Your class should be named solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		
	}
	

}

