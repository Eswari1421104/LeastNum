package leastoccurno;

import java.io.*;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class LeastOccurNo
{
    public static void main(String args[])
    {
        ArrayList<Integer>e=new ArrayList<Integer>();
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int n=str.length();
        
        int m[]=new int[n];
        int b[]=new int[n];
        int i=0,j,count=0;
         
         
         int g=Integer.parseInt(str);
    
while(g>0)
         {
             for(i=0;i<n;i++)
            {
          m[i]=g%10;
         g=g/10;
            }         
         

        }   

for(i=0;i<n;i++)
{
    e.add(m[i]);

        Collections.sort(e);
}

e.remove(n-1);
e.remove(n-2);
e.remove(n-3);
System.out.println(e);
         
         
         

             
                   
    }}
    

