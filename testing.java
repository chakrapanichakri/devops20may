public class MatrixAdditionExample{  
public static void main(String args[]){  
//creating two matrices    
int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
    
//creating another matrix to store the sum of two matrices    
int c[][]=new int[3][3];  //3 rows and 3 columns  
    
//adding and printing addition of 2 matrices    
for(int i=0;i<3;i++){    
for(int j=0;j<3;j++){    
c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
System.out.print(c[i][j]+" ");    
}    
System.out.println();//new line    
}
//////////////This is the modified by giri/////////////////
public class ReverseNumberExample1
{
public static void main(String[] args)
{
int number = 987654, reverse = 0;
while(number != 0)
{
int remainder = number % 10;
reverse = reverse * 10 + remainder;
number = number/10;
}
System.out.println("The reverse of the given number is: " + reverse);
}
}
////////////These modifications made by ram////////////////
import java.lang.Math;   
public class RandomNumberExample1  
{   
public static void main(String args[])   
{   
// Generating random numbers  
System.out.println("1st Random Number: " + Math.random());   
System.out.println("2nd Random Number: " + Math.random());  
System.out.println("3rd Random Number: " + Math.random());   
System.out.println("4th Random Number: " + Math.random());   
}   
}  
}}  

