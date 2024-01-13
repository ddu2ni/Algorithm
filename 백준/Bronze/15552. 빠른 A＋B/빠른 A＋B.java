import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

			int T = Integer.parseInt(br.readLine());

			for (int i = 0; i < T; i++) {
				String[] input = br.readLine().split(" ");
				int A = Integer.parseInt(input[0]);
				int B = Integer.parseInt(input[1]);

				wr.write(A + B + "\n");
			}

			wr.flush();

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}
}