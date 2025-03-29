package problemA;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class NombreOppose {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("NombreOppose.in"));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("NombresOpposeResult.out"), "UTF-8"));

        int n = Integer.parseInt(br.readLine());
        String[] elements = br.readLine().split(" ");
        Set<Integer> positives = new HashSet<>();
        Set<Integer> negatives = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(elements[i]);
            if (num > 0) positives.add(num);
            else negatives.add(-num);
        }

        int count = 0;
        for (int pos : positives) {
            if (negatives.contains(pos)) {
                count++;
            }
        }

        pw.println(count);
        br.close();
        pw.close();
    }

}
