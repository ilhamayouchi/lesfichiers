package problemB;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;

public class BinaireAddition {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("bin.in"));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("bin.out"), "UTF-8"));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            String[] binaries = br.readLine().split(" ");
            BigInteger n1 = new BigInteger(binaries[0], 2);
            BigInteger n2 = new BigInteger(binaries[1], 2);
            BigInteger som = n1.add(n2);

            pw.println(i + " " + som.toString(2));
        }

        br.close();
        pw.close();
    }

}
