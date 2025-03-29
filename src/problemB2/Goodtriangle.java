package problemB2;
import java.io.*;
import java.util.*;
public class Goodtriangle {
	

	    public static int triangularNumber(int n) {
	        return n * (n + 1) / 2;
	    }

	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new FileReader("good.in"));
	        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("good.out")));

	        
	        int N = Integer.parseInt(br.readLine());

	       
	        for (int i = 1; i <= N; i++) {
	            int n = Integer.parseInt(br.readLine());
	            int weightedSum = 0;

	            
	            for (int k = 1; k <= n; k++) {
	                weightedSum += k * triangularNumber(k + 1);
	            }

	          
	            pw.println(i + " " + n + " " + weightedSum);
	        }

	       
	        br.close();
	        pw.close();
	    }
	}



