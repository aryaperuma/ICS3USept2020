package entryTicket;

public class ArrayEntryTicket {

	public static void swapPairs(int[] values){
	    int length = values.length;
	        if(length %2 ==0){
	            for(int i=0; i<length; i=i+2){
	                int c=values[i]+values[i+1];
	                values[i]=c-values[i];
	                values[i+1]=c-values[i+1];
	            }   
	        }
	        if(length%2 !=0){
	            for(int j=0; j<length-1; j=j+2){
	                int c=values[j]+values[j+1];
	                values[j]=c-values[j];
	                values[j+1]=c-values[j+1];
	            }   
	            values[length-1]=values[length-1];
	        }   
	}
	public static void printArray(int[] a){
	    int len=a.length;
	    for(int i=0;i<len;i++)
	        System.out.print(a[i]+" ");
	}
}


