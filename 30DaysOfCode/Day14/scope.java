import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

    public Difference(int[] elements){
        this.elements=elements;
    }
	void computeDifference(){
        int min=elements[0];
        int max=elements[1];
        for(int i=0;i<elements.length;i++){
            if(min<elements[i]){
                min=elements[i];
            }
           if(max>elements[i]){
                max=elements[i];
            }
            
        }
        maximumDifference=Math.abs(max-min);
    }

} // End of Difference class