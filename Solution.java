package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Set;

/* 
Equals and HashCode
*/
public class Solution
{
    private final String first, last;

    public Solution(String first, String last) 
    {
        this.first = first;
        this.last = last;
    }

 /*  public boolean equals(Solution n) 
    {
         
             if(n instanceof Solution) 
             {
               if((first!=null && first==n.first) && (last!=null && last==n.last))
                return true;
                else return false;
             }
                else return false;
    } */
    
     @Override
    public boolean equals(Object obj)
    {
        
             if(!(obj instanceof Solution))  return false;
        
        Solution n = (Solution) obj;
        if (obj == this) return true;
        
        boolean firstPart = (first != null) ? first==n.first : n.first == null;
        
        boolean secondPart = (last != null) ? last==n.last : n.last == null;
        return firstPart && secondPart;  
        
        
    }

    public int hashCode() 
    {
     int firsthashcode = (first==null)  ? 0 : first.hashCode();
     int lasthashcode = (last == null)  ? 0 : last.hashCode();
     
      return 31 * firsthashcode  + lasthashcode;
    } 

    public static void main(String[] args) 
    {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
